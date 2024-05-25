package hwjavastart.les4.ex4dot3adv;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class that trasform dicimal number to 0x system using if-else
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 
 *
 */
public class HW4_3 {
    public static void main(String[] args) {
        // Вибір варіанту
        int myVar = (6 % 20) + 1;
        System.out.println("Варіант задачі, обраний згідно списку - №" + myVar);
        /*
        Виконайте переклад у двійкову систему цілого числа в діапазоні від 0 до 255,
        заданого в якості змінної. Використовуйте в циклі оператор побітового І з маскою
        і зсув.
        * */
        System.out.print("Будь ласка введіть число в діапазоні від 0 до 255: ");
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int mask = 0b00000001;
        userNumber = sc.nextInt();
        System.out.println("Ваше число " + userNumber
                + " при переведенні у двійкову " +
                "систему числення буде дорівнювати: " + Integer.toBinaryString(userNumber));
        if ((userNumber >= 0) && (userNumber <= 255)) {
            for (int i = 0; i <= 7; i++) {
                int maskedNumber = userNumber | mask;
                mask <<= 1;
                //System.out.println(Integer.toBinaryString(mask)+ mask);
                //System.out.println(Integer.toBinaryString(maskedNumber));
                System.out.println(maskedNumber);

            }
        } else {
            System.out.print("Ваше число вийшло за діапазон");
        }
    }
}
