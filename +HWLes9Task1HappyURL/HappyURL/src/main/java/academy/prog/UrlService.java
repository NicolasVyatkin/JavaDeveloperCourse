package academy.prog;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UrlService {
    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Transactional
    public long saveUrl(UrlDTO urlDTO) {
        var urlRecord = urlRepository.findByUrl(urlDTO.getUrl());
        if (urlRecord == null) {
            urlRecord = UrlRecord.of(urlDTO);
            urlRepository.save(urlRecord);
        }

        return urlRecord.getId();
    }

    @Transactional
    public String getUrl(long id) {
        var urlOpt = urlRepository.findById(id);
        if (urlOpt.isEmpty()) {
            return null;
        }

        var urlRecord = urlOpt.get();
        if (urlRecord.isExpired()) {
            urlRepository.delete(urlRecord);
            return null;
        }

        urlRecord.setCount(urlRecord.getCount() + 1);
        urlRecord.setLastAccess(new Date());
        urlRepository.save(urlRecord);

        return urlRecord.getUrl();
    }

    @Transactional
    public void deleteUrl(long id) {
        urlRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<UrlStatDTO> getStatistics() {
        var records = urlRepository.findAll();
        var result = new ArrayList<UrlStatDTO>();

        records.forEach(x -> result.add(x.toStatDTO()));

        return result;
    }
}
