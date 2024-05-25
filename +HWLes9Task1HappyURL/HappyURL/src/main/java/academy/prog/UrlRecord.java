package academy.prog;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UrlRecord {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String url; // long URL

    @Column(nullable = false)
    private Long count;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date lastAccess;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date expirationDate; // new field added for expiration

    public UrlRecord() {
        count = 0L;
        lastAccess = new Date();
        // set default expiration time (7 days from now)
        expirationDate = new Date(System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000));
    }

    public UrlRecord(String url) {
        this();
        this.url = url;
    }

    public static UrlRecord of(UrlDTO urlDTO) {
        return new UrlRecord(urlDTO.getUrl());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Date getExpirationDate() { // getter for expirationDate
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) { // setter for expirationDate
        this.expirationDate = expirationDate;
    }

    public UrlStatDTO toStatDTO() {
        var result = new UrlStatDTO();

        result.setUrl(url);
        result.setShortUrl(Long.toString(id));
        result.setRedirects(count);
        result.setLastAccess(lastAccess);

        return result;
    }

    public boolean isExpired() { // check if url is expired
        return new Date().after(expirationDate);
    }
}
