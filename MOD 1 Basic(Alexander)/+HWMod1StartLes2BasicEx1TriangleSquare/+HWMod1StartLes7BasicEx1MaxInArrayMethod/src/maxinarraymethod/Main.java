package maxinarraymethod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1) Напишите метод который вернет максимальное число из массива целых чисел. Подробнее в видео
 * - https://youtu.be/V-zWQCs6tkk
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array length: ");
        int n = sc.nextInt();
        int[] newArray = createArray(n);
        System.out.println("Generated array is: "+Arrays.toString(newArray));
        System.out.println("The maximum number of the array is: "+findMaxInArray(newArray));

    }

    public static int[] createArray(int n) {//method for array creation
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100 + Math.random() * n * 7);
        }
        return array;
    }
    public static int findMaxInArray(int[] array){//method for searching max in array
        int arrayMax=0;
        for (int i = 0; i < array.length; i++) {
            if (arrayMax<array[i]){
                arrayMax=array[i];
            }
        }
        return arrayMax;
    }
}