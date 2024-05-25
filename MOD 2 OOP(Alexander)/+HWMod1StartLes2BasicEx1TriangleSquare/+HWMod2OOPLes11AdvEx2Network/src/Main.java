
import java.io.File;
import java.io.IOException;
/**
 * @author Kolin Vyatkin
 * @version 1.0
 * */
/*
2) Проверить доступность сайтов указанных в отдельном файле.
* */

public class Main {
    public static void main(String[] args) {
        File file = new File("./Web Check.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            CheckWeb.Ceck(file);
        }catch (IOException e){
            System.out.println("disconnected");;
        }
    }
}