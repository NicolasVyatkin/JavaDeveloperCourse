package com.gmail.niglasksend.progacad.hw2_1;
/**
 * Class that resolves the 2.1. task
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Напишіть клас Computer, атрибутами цього класу є виробник (типу String), serialNumber (типу int),
 * price (типу float), quantityCPU (типу int) і frequencyCPU (типу int). Створіть два об'єкти цього класу з
 * різними значеннями атрибутів.
 * 2. Поля комп’ютерного класу необзідно інкапсулювати. Додайте до класу Computer методи отримання та
 * встановлення знчень полів.
 * 3. Напишіть програму для створення масиву об’єктів Computer (5 шт.).
 * 4. Напишіть програму, яка перебирає масив комп’ютерних об’єктів і збільшує значення у полі ціни на 10
 * відсотків.
 * 5. Додайте до класу Computer метод void view(), який друкує значення усіх полів об’єкта в рядку, і
 * виведіть всю інформацію (значення усіх полів) усіх об’єктів на екран.
 * 6. Зазначте у документованому коментарі класів їх призначення, номер завдання, а також своє ім'я та
 * прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 6) лістинг коду
 * програми та копію виведення результату її роботи.
 */
public class Main {
    public static void main(String[] args) {

        final List computers = new List(new String[]{});

        final Computer Asus = new Computer("Asus", 1102, 3700.99f, 2, 1.80f);
        final Computer Acer = new Computer("Aser", 1104, 3400.99f, 4, 1.60f);
        final Computer Samsung = new Computer("Samsung", 1504, 4000.99f, 4, 2.20f);
        final Computer HP = new Computer("HP", 1609, 4500.99f, 6, 2.40f);
        final Computer DakTech = new Computer("DakTech", 1509, 7000.99f, 8, 3.40f);

        computers.addComputer(Asus);
        computers.addComputer(Acer);
        computers.addComputer(Samsung);
        computers.addComputer(HP);
        computers.addComputer(DakTech);

        computers.view();
        System.out.println();

        computers.viewNewPrice();
        System.out.println();
    }
}