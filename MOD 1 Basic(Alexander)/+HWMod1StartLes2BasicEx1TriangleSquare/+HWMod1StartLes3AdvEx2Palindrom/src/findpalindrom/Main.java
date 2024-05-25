package findpalindrom;

import java.util.Scanner;

/**
 *2) С клавиатуры вводится целое шестизначное число. Проверить, является ли оно палиндромом.
 * Примечание: палиндромом называется число, слово или текст, которые одинакового читаются
 * слева направо и справа налево. Например, это числа 143341, 552255, 710017 и т. д.
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter six numbered number: ");
        int userNumber = sc.nextInt();
        int number1 = userNumber/100000;
        int number2 = (userNumber-number1*100000)/10000;
        int number3 = (userNumber-number1*100000-number2*10000)/1000;
        int number4 = (userNumber-number1*100000-number2*10000-number3*1000)/100;
        int number5 = (userNumber-number1*100000-number2*10000-number3*1000-number4*100)/10;
        int number6 = userNumber-number1*100000-number2*10000-number3*1000-number4*100-number5*10;

//        System.out.println(number1+""+number2+""+number3+""+number4+""+number5+""+number6);

        if (number1==number6&&number2==number5&&number3==number4){
            System.out.println("You entered the palindrome number");
        }else {
            System.out.println("You entered non palindrome number");
        }

    }
}