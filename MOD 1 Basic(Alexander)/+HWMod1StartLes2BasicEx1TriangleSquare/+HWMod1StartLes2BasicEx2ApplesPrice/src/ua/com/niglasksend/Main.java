package ua.com.niglasksend;
/**
 * 2)Стоимость яблока составляет 2$. Покупатель приобретает 6 яблок. Напишите
 * программу которая вычислит и выведет на экран сумму которую должен уплатить
 * покупатель за покупку.
 * */

public class Main {
    public static void main(String[] args) {
        int applePrice = 2;
        int applesBoth = 6;
        int sumToPay= applePrice*applesBoth;
        System.out.println("Customer both "+applesBoth+" apples, prise of each one is "
                +applePrice+" $, so he should pay "+sumToPay+" $");
    }
}