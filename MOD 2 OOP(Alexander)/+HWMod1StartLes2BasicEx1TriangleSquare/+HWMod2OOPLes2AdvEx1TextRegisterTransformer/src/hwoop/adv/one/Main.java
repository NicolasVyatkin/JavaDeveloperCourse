package hwoop.adv.one;

import java.io.File;
import java.util.Scanner;

/**
 * @author Kolin Vyatkin
    * Задание для самостоятельной проработки.
    * Продвинутый уровень.
        * 1) Создайте класс TextTransformer.
            * Метод:
                * ● String transform(String text) — Переводит текст в верхний регистр. Пример hello→ HELLO
        * 2) Создайте класс InverseTransformer как подкласс TextTransformer. Переопределите метод String
                * transform(String text) — Производит реверс текста. Пример hello → olleh
        * 3) Создайте класс UpDownTransformer как подкласс TextTransformer. Переопределите метод String
            * transform(String text) — Каждая нечетная буква большая, четная маленькая. Пример hello → HeLlO
        * 4) Создайте класс TextSaver.
            * Поля:
                 * ● TextTransformer transformer
                 * ● File file
             * Методы:
                 * ● void saveTextToFile(String text) — Сначала преобразует одним из трансформеров (поле
                 * transformer) строку, после чего сохранить ее в файл(поле file).
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст для его перевода в верхний регистр: ");
        String inputUpText = sc.next();
        TextTransformer textUp = new TextTransformer(inputUpText);
        textUp.textTransform(inputUpText);
        System.out.print("Введите текст для его реверса: ");
        String inputRevText = sc.next();
        InverseTransformer textRev = new InverseTransformer(inputRevText);
        System.out.println(textRev);
        textRev.textTransform(inputRevText);
        System.out.print("Введите текст для построения забора: ");
        String inputUpDownText = sc.next();
        UpDownTransformer textUpDown = new UpDownTransformer(inputUpDownText);
        System.out.println(textUpDown);
        textUpDown.textTransform(inputUpDownText);

        File file = new File("text.txt");
        TextSaver writeTextToFile = new TextSaver(textUpDown, file);
        writeTextToFile.saveTextToFile(inputUpDownText + inputRevText + inputUpText);
    }
}
