/*
    1) Создайте консольный «текстовый редактор» с возможностью сохранения набранного текста в
файл.
 */

package hwstartles1.basic.one;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Сканер для считывания с клавиатуры и записи в переменную
        Scanner sc = new Scanner(System.in);
        System.out.print("Пожадуйста введите текст для записи в файл: ");
        String inputText = sc.next();
        System.out.println("Вы ввели следующий текст: " + inputText);
        File file = new File("input.txt");

        //Запись текста в файл
        TextSaver saveText = new TextSaver();
        saveText.saveTextToFile(inputText,file);

    }

}