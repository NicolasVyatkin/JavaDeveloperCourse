package multitheadfilesearch;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String find = "file.txt";
        File path = new File("C:/Education");
        Manager search = new Manager(find, path);
    }
}