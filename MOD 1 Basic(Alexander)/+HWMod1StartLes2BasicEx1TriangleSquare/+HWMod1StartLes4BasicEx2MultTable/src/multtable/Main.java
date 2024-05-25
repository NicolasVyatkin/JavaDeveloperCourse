package multtable;

import java.util.Scanner;

/**
 * 2) Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 = 5, 2 x 5 = 10, а не просто 5,
 * 10 и т. д.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number from 1 to 10 to build the multiplication table: ");
        int n = sc.nextInt();
        if (n >= 1 && n <= 10) {
            for (int i = 1; i >= 1&&i<=10; i++) {
                int mult = n * i;
                System.out.println(n + " x " + i + " = " + mult);

            }
        } else {
            System.out.println("You should enter number between 1 and 10!");
        }

    }
}