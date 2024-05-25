package calcsum;

/**
 *2) Написать код для многопоточного подсчета суммы элементов
 * массива целых чисел. Сравнить скорость подсчета с простым
 * алгоритмом.
 * */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        long time;
        Random rand = new Random();
        int[] array = new int[200_000_000];
        int[] arrayPart1 = new int[100_000_000];
        int[] arrayPart2 = new int[100_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }

        time = System.currentTimeMillis();
        System.out.println("Main thread sum is :" + calculateArray(array));
        System.out.println("Main thread time is: " + (time = System.currentTimeMillis() - time) + "\n");

        System.arraycopy(array, 0, arrayPart1, 0, 100_000_000);
        System.arraycopy(array, 100_000_000, arrayPart2, 0, 100_000_000);
        SumThread sumThread1 = new SumThread(arrayPart1);
        SumThread sumThread2 = new SumThread(arrayPart2);

        time = System.currentTimeMillis();
        try {
            sumThread1.getThr().join();
            sumThread1.getThr().join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Multithreaded sum is: " + (sumThread1.getSum() + sumThread2.getSum()));
        System.out.println("Multithreaded time is: " + (time = System.currentTimeMillis() - time) + "\n");
    }

    public static int calculateArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}