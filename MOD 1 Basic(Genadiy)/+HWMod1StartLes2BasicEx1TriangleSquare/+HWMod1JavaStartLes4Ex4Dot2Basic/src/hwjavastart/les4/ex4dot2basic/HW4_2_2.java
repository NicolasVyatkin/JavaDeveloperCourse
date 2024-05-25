package hwjavastart.les4.ex4dot2basic;


import java.util.Scanner;

/**
 * Class that prints a numeric triangle
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * Домашнє завдання #2 з уроку №4:
 * 1. Напишіть програму, яка виводить на екран наступне:
 *
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 8 7 6 5 4 3 2 1
 *
 *
 * Використовуйте вкладені оператори організації циклів (for).
 * Для виведення значень без переходу на новий рядок використовуйте оператор System.out.print(...).
 * 2. Зазначьте у документованому коментарі класу своє ім'я та прізвище, а також номер варіанту та текст
 * завдання.
 * 3. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 4) лістинг коду програми
 * та копію виведення результату її роботи.
 */
public class HW4_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        System.out.print("Будь ласка введіть розмір тикутника для його побудови: ");
        userNumber = sc.nextInt();
        for (int i = 1; i <= userNumber; i++) {
            for (int j = i; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
