package com.gmail.niglasksend.progacad.hw2_2_3;

import java.util.Scanner;
/**
 * Class that resolves the 2.2.3 task
 *
 * @author Kolin Vyatkin
 * @version 1.0
 *      1. Напишіть клас ShapesArea із перевизначеними методами calcSquare, які обчислюють
 *          площу прямокутника, квадрата та площу кола та виводять результат на екран.
 *      2. Створіть клас, який використовуватиме екземпляр класу ShapesArea та його методи.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ShapesArea calcArCircle = new ShapesArea();
        System.out.print("Input the radius of the circle - ");
        double rad = sc.nextDouble();
        calcArCircle.calcSquare(rad);

        ShapesArea calcArSquare = new ShapesArea();
        System.out.print("Input the length of the side of the square - ");
        int side = sc.nextInt();
        calcArSquare.calcSquare(side);

        ShapesArea calcArRectangle = new ShapesArea();
        System.out.println("Input the length of the sides of the square - ");
        System.out.print("First: ");
        int a = sc.nextInt();
        System.out.print("Second: ");
        int b = sc.nextInt();
        calcArRectangle.calcSquare(a,b);



    }
}