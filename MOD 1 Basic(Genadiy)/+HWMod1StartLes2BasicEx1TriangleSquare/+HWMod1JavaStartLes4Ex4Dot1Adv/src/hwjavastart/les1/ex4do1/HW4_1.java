package hwjavastart.les1.ex4do1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class that trasform dicimal number to 0x system using if-else
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * Переведіть в шістнадцяткову систему числення будь-яке ціле число в
 * діапазоні від 0 до 255 включно, задане як змінна
 */
public class HW4_1 {
    public static void main(String[] args) {
        // Вибір варіанту
        int myVar = (6 % 20) + 1;
        System.out.println("Варіант задачі, обраний згідно списку - №" + myVar);
        /*
        Умова задачі
        Переведіть в шістнадцяткову систему числення будь-яке
        ціле число в діапазоні від 0 до 255 включно, задане як змінна
        * */
        System.out.print("Будь ласка введіть число в діапазоні від 0 до 255: ");
        Scanner sc = new Scanner(System.in);
        int userNumber;
        userNumber = sc.nextInt();
        if ((userNumber >= 0) && (userNumber <= 255)) {
            System.out.println("Ваше число " + userNumber
                    + " при переведенні у шістнадцяткову " +
                    "систему числення буде дорівнювати: " + Integer.toHexString(userNumber));
        } else {
            System.out.print("Ваше число вийшло за діапазон");
        }
    }
}
