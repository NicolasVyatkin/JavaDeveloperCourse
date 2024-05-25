package arrayfromboard;


import java.util.Arrays;
import java.util.Scanner;

/**
 *2) Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) и
 * возможности заполнения каждого его элемента вручную. Выведите этот массив на экран.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the quantity of the elements in the array: ");
        int n = sc.nextInt();

        int[] newArray = new int[n];
        System.out.print("Please enter "+n+" elements of the array: ");
        System.out.println("");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("Element/index " +i+" : ");
            newArray[i]=sc.nextInt();
        }
        System.out.println("Your array is - "+Arrays.toString(newArray));

    }
}