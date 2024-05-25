package starbox;

import java.util.Scanner;

/**
 * 3) Выведите на экран прямоугольник из *. Причем высота и ширина прямоугольника вводятся с
 * клавиатуры. Например ниже представлен прямоугольник с высотой 4 и шириной 5.
 * *****
 * *   *
 * *   *
 * *****
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length ot the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Please enter the height ot the rectangle: ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            if (i == 1) {
                for (int j = 1; j <= length; j++) {
                    System.out.print("* ");
                }
            } else if (i > 1 && i < height) {
                for (int j = 1; j <= length; j++) {
                    if (j == 1 || j == length) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            } else {
                for (int j = 1; j <= length; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}