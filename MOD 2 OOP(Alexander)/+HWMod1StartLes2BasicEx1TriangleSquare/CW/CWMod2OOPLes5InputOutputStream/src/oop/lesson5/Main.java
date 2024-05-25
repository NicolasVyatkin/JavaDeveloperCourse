package oop.lesson5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File("/home/alexander/Pictures/IMG_20221130_144421.jpg");

        File fileOut = new File(fileIn.getName());

        try {
            System.out.println(FileService.copyFile(fileIn, fileOut) + " byte copy");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
