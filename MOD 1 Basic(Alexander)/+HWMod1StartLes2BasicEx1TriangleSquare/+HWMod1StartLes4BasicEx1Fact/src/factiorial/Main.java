package factiorial;

import java.util.Scanner;

/**
 * 1) Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16). Факториал
 * числа это произведение всех чисел от этого числа до 1. Например 5!=5*4*3*2*1=120
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter n to count its factorial, it should be  4<n<16: ");
        int n = sc.nextInt();
        if (n > 4 && n < 16) {
            int fact = 1;
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.println("The factorial of the number " + n + " is " + fact);
        } else {
            System.out.println("Wrong n size, please enter value between 4 and 16!");
        }


    }
}