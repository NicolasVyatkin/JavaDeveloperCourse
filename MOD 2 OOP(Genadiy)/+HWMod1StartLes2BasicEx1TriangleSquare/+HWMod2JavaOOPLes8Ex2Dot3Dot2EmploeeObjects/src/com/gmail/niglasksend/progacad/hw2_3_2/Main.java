package com.gmail.niglasksend.progacad.hw2_3_2;

/**
 * @author Kolin Vyatkin
 * @version 1.0
 *  */
/*
1. Створіть клас Employee з полями firstName, lastName, occupation, phone та статичне поле
        numberOfEmployees разом з відповідними геттерами та сеттерами. Також у класі повинен бути конструктор,
        який ініціалізує поля класу та збільшує кількість співробітників.
2. Напишіть клас Main з методом main, у якому який створить три об'єкти Employee та виведіть кількість
        сівробітників із класу.

 */

public class Main {
    public static void main(String[] args) {

        Employee artisticDirector = new Employee("Natalia","O'Shay",
                "Artistic director","+38099");
        System.out.println(artisticDirector);
        Employee guitarArtist = new Employee("Sergey", "Vishnyakov",
                "Guitar artist", "+38066");
        System.out.println(guitarArtist);
        Employee drumKitArtist  = new Employee("Dmitry", "Frolov",
                "Drum kit artist", "+38050");
        System.out.println(drumKitArtist);

        System.out.println("Number of employee in the group: " + Employee.getNumberOfEmployees());

    }
}