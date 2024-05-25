package network;



import java.io.*;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

import javax.swing.JOptionPane;

/**
 * @author Kolin Vyatkin
 * @version 1.0
 * */
/*
*1) Напишите программу, которая выведет в файл все ссылки, которые содержатся в html документе,
который будет прислан в результате запроса на произвольный URL.
* */

public class Main {

    public static void main(String[] args) {
//        allLinksToFile();
        File fileIn = new File(".\\src\\net\\ukr\\andy777\\Prog.kiev.ua.html");
        File fileOut = new File(".\\src\\net\\ukr\\andy777\\hrefs.txt");

        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            for (; ; ) {
                Socket clientSocket = serverSocket.accept();
                InetAdressFind iaf = new InetAdressFind(fileIn, fileOut);
                iaf.findAdressInFile();
                Client client = new Client(clientSocket, iaf.fileContent());
            }
        } catch (IOException e) {
            System.out.println("Error to server Socket Open!!!");
        }
    }

}


//    public static void allLinksToFile() {
//        String html = JOptionPane.showInputDialog("Input URL \nExample:https://www.google.com/");
//        String line = "";
//        String links = "";
//        StringBuilder buf = new StringBuilder();
//        try {
//            URL url = new URL(html);
//            HttpURLConnection http = (HttpURLConnection) url.openConnection();
//            BufferedReader bf = new BufferedReader(new InputStreamReader(http.getInputStream()));
//            while ((line = bf.readLine()) != null) {
//                buf.append(line + "\n");
//
//            }
//            while (true) {
//                if (buf.indexOf("https://") < 0) {
//                    break;
//                } else {
//                    buf.delete(0, buf.indexOf("https://") - 1);
//                    links += buf.substring(buf.indexOf("https://"), buf.indexOf(" ")) + "\n";
//                    buf.delete(buf.indexOf("https://"), buf.indexOf(" "));
//                }
//            }
//            saveToFile(links);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void saveToFile(String a) {
//        try (PrintWriter pw = new PrintWriter("Link.txt")) {
//            pw.write(a + "\n");
//        } catch (IOException e) {
//            // TODO: handle exception
//        }
//    }
