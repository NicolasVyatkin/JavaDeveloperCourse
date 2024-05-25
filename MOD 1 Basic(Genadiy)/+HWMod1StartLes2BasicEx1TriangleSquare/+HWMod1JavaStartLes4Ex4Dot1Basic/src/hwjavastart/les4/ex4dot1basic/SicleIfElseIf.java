package hwjavastart.les4.ex4dot1basic;
import java.util.Scanner;
/**

 * @author  Kolin Vyatkin
 * @version 1.0
 * Домашнє завдання #1 з уроку №4:
 * 1. Напишіть програму, яка запитує у користувача число, зчитує його з клавіатури та зберігає у змінній
 * int під назвою "number".
 * Потім друкує "One", "Two",... , "Nine", якщо змінна "number" дорівнює 1, 2,... , 9 та "Other", якщо
 * number > 9 або number < 1, відповідно:
 * 	а) у першій реалізації програми використовуйте оператори if-else;
 * 	б) у другій реалізації програми використовуйте оператор switch у класичній формі;
 * 	в) у третій реалізації програми використовуйте оператор enhanced switch.
 * 2. Зазначьте у документованому коментарі класу своє ім'я та прізвище, а також номер варіанту та текст
 * завдання.
 * 3. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 4) лістинг коду
 * програми та копію виведення результату її роботи.
 */
public class SicleIfElseIf {
    /**
     *
     * @param args line command arguments
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        if (number == 1){
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}