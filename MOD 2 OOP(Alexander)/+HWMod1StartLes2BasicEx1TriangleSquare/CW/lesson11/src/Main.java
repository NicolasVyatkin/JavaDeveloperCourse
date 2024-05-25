import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
//    String spec = "https://dou.ua/";
//
//    try {
//      String htmlText = NetworkService.getStringFromURL(spec, "UTF-8");
//      System.out.println(htmlText);
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

        String spec = "https://s.dou.ua/CACHE/images/img/announces/questions_to_software_architect-yt-cover-1920-2_1-min/34e65abec2225eecf2b27ed8135a107c.jpeg";
//    File folder = new File("Img");
//    folder.mkdirs();
//
//    try {
//      NetworkService.getFileFromURL(spec, folder);
//      System.out.println("Done");
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

//    try {
//      Map<String, List<String>> headers = NetworkService.getHeadersFromURL(spec);
//      Set<String> keys = headers.keySet();
//      for (String k : keys) {
//        System.out.println(k + " - " + headers.get(k));
//      }
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

        String html = "<!doctype html>\n<html>\n <head>\n<title>This is the sample webpage!</title>\n</head>\n"
                + "<body>\nJava the best\n</body>\n</html>";


        try (ServerSocket serSocket = new ServerSocket(8080)) {
            for (;;) {
                Socket socket = serSocket.accept();
                MyServer ns = new MyServer(socket, html);
                Thread thr = new Thread(ns);
                thr.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}