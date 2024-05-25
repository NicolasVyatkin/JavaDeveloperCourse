package findallcombinations;

import java.util.Arrays;
import java.util.Scanner;

/**
 *Существует массив {1,2,3,4,5} — размер массива может быть произвольным. Напишите программу
 * которая выведет на экран все возможные комбинации из этих цифр. Внимание повторений и
 * пропусков быть не должно. Подробнее в видео - https://youtu.be/bp5_gvIdLEU
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of the array and press Enter: ");
        int size = sc.nextInt();
        while (size <= 1) {
            System.out.println("Invalid input! Try again.");
            size = sc.nextInt();
        }
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        changeArray(numbers, numbers.length);
    }

    static void changeArray(int[] array, int index) {
        int element;
        if (index <= 0) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int j = 0; j < index; j++) {
                for (int i = 0; i < index; i++) {
                    element = array[i];
                    array[i] = array[index - 1];
                    array[index - 1] = element;
                }
                changeArray(array, index - 1);
            }
        }
    }
}