package hwjavastart.les4.ex4dot2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class that trasform a dicimal number to 0x system using switch and ternar
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 
 */
public class HW4_2 {
    public static void main(String[] args) {
        // Вибір варіанту
        int myVar = (6 % 20) + 1;
        System.out.println("Варіант задачі, обраний згідно списку - №" + myVar);
        /*
        Умова задачі
        Переведіть в шістнадцяткову систему числення будь-яке
        ціле число в діапазоні від 0 до 255 включно, задане як змінна
        * */
        /*
        На основі розробленої програми створіть ще одну, проте використовуйте
        у ній оператор switch. При необхідності виконайте заміну умови if виразом
        switch за допомогою тернарного оператора.
        **/
        System.out.print("Будь ласка введіть число в діапазоні від 0 до 255: ");
        Scanner sc = new Scanner(System.in);
        int userNumber;
        userNumber = sc.nextInt();
        int addInf = ((userNumber >= 0) && (userNumber <= 255)) ? 1 : 0;
        switch (addInf) {
            case 1:
                System.out.println("Ваше число " + userNumber
                        + " при переведенні у шістнадцяткову " +
                        "систему числення буде дорівнювати: " + Integer.toHexString(userNumber));
                break;
            case 0:
                System.out.print("Ваше число вийшло за діапазон");
                break;
        }
    }
}
