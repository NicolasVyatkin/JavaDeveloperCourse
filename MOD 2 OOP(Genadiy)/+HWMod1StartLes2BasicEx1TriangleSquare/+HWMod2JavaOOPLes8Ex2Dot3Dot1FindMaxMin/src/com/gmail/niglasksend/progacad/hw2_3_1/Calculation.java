package com.gmail.niglasksend.progacad.hw2_3_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class that resolves the 2.3.1 task
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть клас MyMath із двома статичними методами (findMin і findMax), які
 *      прийматимуть масив значень int як аргумент і повертатимуть мінімальне значення
 *      елемента (для методу findMin) та максимальне значення елемента (для методу findMax).
 * 2. Створіть клас Calculation, який створить два масиви цілих чисел і використає статичні
 *      методи findMin і findMax класу MyMath.
 * 3. Додайте до класу MyMath константу PI = 3.14 і статичний метод areaOfCircle, який
 *      прийматиме радіус як параметр, використовуватиме константу PI та обчислюватиме площу.
 * 4. Додайте до класу Calculation код, який використає метод areaOfCircle для довільного
 *      радіусу, що вводиться користувачем з консолі.
 */

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyMath calcArCircle = new MyMath();
        System.out.print("Input the radius of the circle - ");
        double rad = sc.nextDouble();
        calcArCircle.areaOfCircle(rad);

        MyMath arrOne = new MyMath();
        int minArr[] = arrOne.createArray();
        System.out.println("The current min matrix is: " + Arrays.toString(minArr));
        System.out.println("Minimum value is: " + MyMath.findMin(minArr));

        MyMath arrTwo = new MyMath();
        int maxArr[] = arrTwo.createArray();
        System.out.println("The current max matrix is: " + Arrays.toString(maxArr));
        System.out.println("Maximum value is: " + MyMath.findMax(maxArr));
    }
}

//        System.out.print("Input the landth of the arrays: ");
//        int size = sc.nextInt();
//        com.gmail.niglasksend.progacad.hw2_3_1.MyMath minMatrix = new com.gmail.niglasksend.progacad.hw2_3_1.MyMath(size);
//        int minArr[]=minMatrix.
//        System.out.print("The current min matrix is: ");
//        minMatrix.print();
//
//        System.out.println("Min in arr a = :" + com.gmail.niglasksend.progacad.hw2_3_1.MyMath.findMin(a));
//
//
//        System.out.println();
//
//
//        com.gmail.niglasksend.progacad.hw2_3_1.MyMath maxMatrix = new com.gmail.niglasksend.progacad.hw2_3_1.MyMath(size);
//        System.out.print("The current max matrix is: ");
//        maxMatrix.print();
//        System.out.println();
//
//        System.out.println("Min in arr a = :" + com.gmail.niglasksend.progacad.hw2_3_1.MyMath.findMax(b));



