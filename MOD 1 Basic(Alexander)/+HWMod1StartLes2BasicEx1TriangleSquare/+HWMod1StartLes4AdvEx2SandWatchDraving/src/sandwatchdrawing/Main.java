package sandwatchdrawing;

import java.util.Scanner;

/**
 *2) С помощью вложенных циклов выведите на экран «песочные часы», максимальная ширина
 * которых считывается с клавиатуры (число нечетное). В примере ширина равна 5.
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Please enter width of the figure: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j & i >= (n + 1) - j | (i <= j & i <= (n + 1) - j)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
                if (j % n == 0) {
                    System.out.println("");
                }
            }
        }
    }
}