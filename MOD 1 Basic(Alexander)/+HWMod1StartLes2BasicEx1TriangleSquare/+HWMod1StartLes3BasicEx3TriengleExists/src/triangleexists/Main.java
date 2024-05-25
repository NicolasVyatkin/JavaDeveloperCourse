package triangleexists;

import java.util.Scanner;

/**
 * 3) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей. Дано: a,
 * b, c – стороны предполагаемого треугольника. Напишите программу, которая укажет, существует ли
 * такой треугольник или нет.
 */

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Please enter three sides of the triangle");
        System.out.print("Side a: ");
        double a = cs.nextDouble();
        System.out.print("Side b: ");
        double b = cs.nextDouble();
        System.out.print("Side c: ");
        double c = cs.nextDouble();
        if (a + b >= c && a + c >= b && b + c >= a) {
            double p = (a + b + c) / 2;
            double sq = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Thi triangle exists and its aria is " + sq);
        } else {
            System.out.println("There is no such triangle in this reality");
        }


    }
}