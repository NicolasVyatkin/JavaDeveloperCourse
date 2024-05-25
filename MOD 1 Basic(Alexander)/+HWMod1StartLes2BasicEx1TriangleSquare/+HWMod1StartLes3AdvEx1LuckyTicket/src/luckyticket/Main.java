package luckyticket;

import java.util.Scanner;

/**
 *1) Пользователь вводит целое четырехзначное число. Проверить, является ли оно номером
 * «счастливого билета». Примечание: счастливым билетом называется число, в котором, при четном
 * количестве цифр в числе, сумма цифр его левой половины равна сумме цифр его правой
 * половины. Например, рассмотрим число 1322. Его левая половина равна 13, а правая 22, и оно
 * является счастливым билетом (т. к. 1 + 3 = 2 + 2).
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter number that contains 4 numbers from 0 to 9: ");
        int userNumber = sc.nextInt();
//        System.out.println(userNumber);
        int firstNumber = userNumber/1000;
        int secondNumber = (userNumber-firstNumber*1000)/100;
        int thirdNumber = (userNumber-firstNumber*1000-secondNumber*100)/10;
        int forthNumber = userNumber-firstNumber*1000-secondNumber*100-thirdNumber*10;
        if (firstNumber+secondNumber==thirdNumber+forthNumber){
            System.out.println("Your number "+userNumber+" is a number of a lucky ticket because "
            + firstNumber+" + "+secondNumber+" = "+thirdNumber+" + "+forthNumber);
        }else {
            System.out.println("Wish you luck in next number");
        }
    }

}