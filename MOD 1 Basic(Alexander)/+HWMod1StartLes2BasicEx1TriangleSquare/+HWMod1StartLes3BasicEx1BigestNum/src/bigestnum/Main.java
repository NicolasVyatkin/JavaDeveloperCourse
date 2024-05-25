package bigestnum;

import java.util.Scanner;

/**
 * 1)Написать программу которая считает 4 целых числа с клавиатуры и выведет на экран самое
 * большое из них.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Input the second number: ");
        int secondNum = sc.nextInt();
        System.out.print("Input the third number: ");
        int thirdNum = sc.nextInt();
        System.out.print("Input the forth number: ");
        int forthNum = sc.nextInt();
        if (firstNum > secondNum && firstNum > thirdNum && firstNum > forthNum) {
            System.out.println("First number "+ firstNum+" is the bigest");

        } else if (secondNum > firstNum && secondNum > thirdNum && secondNum > forthNum) {
            System.out.println("Second number"+ secondNum+" is the bigest");

        } else if (thirdNum > firstNum && thirdNum > secondNum && thirdNum > forthNum) {
            System.out.println("Third number "+ thirdNum+" is the bigest");
        } else System.out.println("Forth number"+ forthNum+" is the bigest");
    }
}