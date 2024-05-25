package suminarray;

import java.util.Arrays;

/**
 * 1) Дан массив целых чисел вида — {0,5,2,4,7,1,3,19}. Написать программу для подсчета количества
 * нечетных чисел в нем.
 */

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum of the irregular numbers of the array " + Arrays.toString(array) + " is " + sum);
    }
}