package revarray;

import java.util.Arrays;

/**
 * 1) Написать код для зеркального переворота массива. Например (7,2,9,4) -> (4,9,2,7). Массив может
 * быть произвольной длинны. Использовать дополнительный массив запрещено. Подробнее в
 * этом видео - https://youtu.be/JH970VCdvzI
 */

public class Main {
    public static void main(String[] args) {
        int[] arr, arrMirrored;
        arr = new int[]{7, 2, 9, 4};
        System.out.println("Basic arr:"+ Arrays.toString(arr));
        System.out.print("Reversed arr: ");
        arrMirrored = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrMirrored[i] = arr[arr.length - 1 - i];
        }
        for (int x : arrMirrored
        ) {
            System.out.print(x + " ");
        }
    }
}

//        int[] arr1 = {7, 2, 9, 4};
//        reverseArr1(arr1);
//        System.out.print(Arrays.toString(arr1));


//    public static int[] reverseArr1(int[] arr1) {
//
//        if (arr1 == null) return arr1;
//        int n = arr1.length;
//        for (int i = 0; i < n / 2; i++) {
//            int temp = arr1[i];
//            arr1[i] = arr1[n - 1 - i];
//            arr1[n - 1 - i] = temp;
//
//        }
//        return arr1;
//    }
