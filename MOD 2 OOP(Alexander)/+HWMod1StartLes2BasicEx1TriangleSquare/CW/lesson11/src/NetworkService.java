import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class NetworkService {

    public static String getStringFromURL(String spec, String code) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
            String text = "";
            String temp = "";
            for (;;) {
                temp = br.readLine();
                if (temp == null) {
                    break;
                }
                text += temp + System.lineSeparator();
            }
            return text;
        }
    }

    public static void getFileFromURL(String spec, File folder) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        int n = spec.lastIndexOf("/");
        String fileName = spec.substring(n + 1);
        File file = new File(folder, fileName);
        try (InputStream is = connection.getInputStream(); OutputStream os = new FileOutputStream(file)) {
            is.transferTo(os);
        }
    }

    public static Map<String, List<String>> getHeadersFromURL(String spec) throws IOException {
        URL url = new URL(spec);
        URLConnection connection = url.openConnection();
        return connection.getHeaderFields();
    }

}