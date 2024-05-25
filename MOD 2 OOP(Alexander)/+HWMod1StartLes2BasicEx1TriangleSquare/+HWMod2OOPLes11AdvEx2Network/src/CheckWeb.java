import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class CheckWeb {
    public static void Ceck(File file)throws IOException {
        if(file == null){
            throw new IllegalArgumentException("no file");
        }
        Map<String,String> map = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String web = "";
            for(;(web = bufferedReader.readLine()) != null;){
                System.out.println(web+" = "+isAlive(web));
            }
        }catch (IOException e){
            throw e;
        }
    }
    private static String isAlive(String web) throws IOException{
        String stag = "Connected";
        try {
            URL url = new URL(web);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if(httpURLConnection.getResponseCode() == -1){
                stag = "Disconnected";
            }
        }catch (IOException e){
            throw e;
        }
        return stag;
    }
}
