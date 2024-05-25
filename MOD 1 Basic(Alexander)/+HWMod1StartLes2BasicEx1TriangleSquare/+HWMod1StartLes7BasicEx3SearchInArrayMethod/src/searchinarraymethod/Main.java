package searchinarraymethod;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3) Напишите метод который реализует линейный поиск элемента в массиве целых чисел. Если такой
 * элемент в массиве есть то верните его индекс, если нет то метод должен возвращать число - «-1».
 * Подробнее в видео - https://youtu.be/zh0wT6XVrUY
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the array length: ");
        int n = sc.nextInt();
        int[] newArray = createArray(n);
        System.out.println("Generated array is: " + Arrays.toString(newArray));
        System.out.print("Input the number which index you wanna find: ");
        int ind = sc.nextInt();
        searchInArray(newArray, ind);


    }

    public static int[] createArray(int n) {//method for array creation
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100 + Math.random() * n * 7);
        }
        return array;
    }

    public static void searchInArray(int[] arr, int ind) {

//       System.out.println(Arrays.toString(arr).indexOf(ind));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ind) {
                System.out.println("Your number " + ind + " is located at " + i + " index of the array");
            }//else System.out.println("-1");
        }
    }

    static int Search(int[] arr, int x) {
        int nores = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                nores = i;
            }
        }
        return nores;
    }
}