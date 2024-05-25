/**
    2) Напишите метод для сохранения в текстовый файл двухмерного массива целых чисел.
    3) Реализуйте метод который выведет на экран список всех каталогов расположенных в каталоге
адрес которого будет параметром этого метода.
 */

package hwstertles8.basic.twoandthree;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Сканер для считывания с клавиатуры и записи в переменную
        System.out.print("Enter the matrix size: ");
        Scanner sh = new Scanner(System.in);
        int size = sh.nextInt();
        Matrix curentMatrix = new Matrix(size);
        System.out.println("The current matrix size " + size+"x"+ size);
//        curentMatrix.print();
        System.out.println(curentMatrix.twoLevelArrayToString());
        System.out.println();


        File file = new File("matrix.txt");

        //Запись массива в файл
        ArraySaver saveArray = new ArraySaver();
        saveArray.saveTextToFile(curentMatrix.twoLevelArrayToString(),file);

        //Каталоги в директории
        System.out.println("Введите путь для анализа каталога (. по умолчанию): ");
        String path = sh.next();
        File folderOne = new File(path);
        File[]files = folderOne.listFiles();
        for (File fileOne:files){
            System.out.println(fileOne+(fileOne.isFile()?" - File":" - Folder"));
        }


    }
}