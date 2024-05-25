package starboxmethod;

import java.util.Scanner;

/**
 * 2) Реализуйте метод рисующий на экране прямоугольник из звездочек «*» — его параметрами будут
 * целые числа которые описывают длину и ширину такого прямоугольника.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length and height of the rectangle");
        System.out.print("Length is: ");
        int l = sc.nextInt();
        System.out.print("Height is: ");
        int h = sc.nextInt();
        buildFigure(l, h);
    }

    public static void buildFigure(int l, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}