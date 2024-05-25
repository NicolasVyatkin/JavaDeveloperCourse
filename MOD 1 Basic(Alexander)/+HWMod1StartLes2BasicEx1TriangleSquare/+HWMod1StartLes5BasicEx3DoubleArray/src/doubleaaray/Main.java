package doubleaaray;

import java.util.Arrays;

/**
 * 3) Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза
 * больше, первые 15 элементов должны быть равны элементам первого массива, а остальные
 * элементы заполнить удвоенных значением начальных. Например:
 * Было → {1,4,7,2}
 * Стало → {1,4,7,2,2,8,14,4}
 */

public class Main {
    public static void main(String[] args) {
        int arrOne[] = new int[15];
        int[] arrTwo = new int[15];

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = (int) (Math.random() * 77 + 1);
            arrTwo[i] = arrOne[i] * 2;
        }
        int arrOneX2[] = Arrays.copyOf(arrOne, 30);
        for (int i = 0; i < arrTwo.length; i++) {
            arrOneX2[i + 15] = arrTwo[i];
        }
        System.out.println("The first array is:" + Arrays.toString(arrOne));
        System.out.println("The second array is:" + Arrays.toString(arrTwo));
        System.out.println("The first+second array is:" + Arrays.toString(arrOneX2));

    }
}
