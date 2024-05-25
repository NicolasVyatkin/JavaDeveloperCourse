package com.gmail.niglasksend.progacad.hw2_3_1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.PI;
public class MyMath {
    private int[] matrix;
    public int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array that gonna be created: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];

        for (int i = 0; i < size; ++i) {
            myArray[i] = (int) (Math.random() * 15.0 + 1.0);
        }
        return myArray;
    }
    public MyMath() {

    }

    public void print() {
        int[] arr = this.matrix;
        System.out.println(Arrays.toString(arr));
    }
    public static int findMin(int matrix[]) {

        int min = matrix[0];

        for (int j = 1; j < matrix.length; j++) {

            min = Math.min(min, matrix[j]);
        }
        return min;
    }
    public static int findMax(int matrix[]) {

        int max = matrix[0];

        for (int j = 1; j < matrix.length; j++) {

            max = Math.max(max, matrix[j]);
        }
        return max;
    }
    public static void areaOfCircle(double rad) {
        System.out.println("Square of circle is: " + String.format("%.2f", PI * Math.pow(rad, 2)));
    }
}

//    public static int getMax(int[] A)
//    {
//        int max = Integer.MIN_VALUE;
//        for (int i: A) {
//            max = Math.max(max, i);
//        }
//
//        return max;
//    }
//
//    public static int getMin(com.gmail.niglasksend.progacad.hw2_3_1.MyMath A)
//    {
//        int min = Integer.MAX_VALUE;
//        for (int i: A) {
//            min = Math.min(min, i);
//        }
//
//        return min;
//    }


//    public static int findMax(int[] inputArray) {
//        int maxValue = inputArray[0];
//        for (int i = 1; i < inputArray.length; i++) {
//            if (inputArray[i] > maxValue) {
//                maxValue = inputArray[i];
//            }
//        }
//        System.out.println("Maximum Value is: "+maxValue);
//        return maxValue;
//    }
//
//    public static int findMin(int[] inputArray) {
//        int minValue = inputArray[0];
//        for (int i = 1; i < inputArray.length; i++) {
//            if (inputArray[i] < minValue) {
//                minValue = inputArray[i];
//            }
//        }
//        System.out.println("Maximum Value is: "+minValue);
//        return minValue;
//    }

//    public com.gmail.niglasksend.progacad.hw2_3_1.MyMath(int n) {
//        int[] array = new int[n];
//
//        for (int i = 0; i < n; ++i) {
//            array[i] = (int) (Math.random() * 15.0 + 1.0);
//        }
//
//        this.matrix = array;
//    }
//
//    public com.gmail.niglasksend.progacad.hw2_3_1.MyMath(int[] matrix) {
//        this.matrix = matrix;
//    }

