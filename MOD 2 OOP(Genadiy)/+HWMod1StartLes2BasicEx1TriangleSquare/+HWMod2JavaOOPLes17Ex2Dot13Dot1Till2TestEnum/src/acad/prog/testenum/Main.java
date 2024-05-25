package acad.prog.testenum;

import java.util.Scanner;

/**
 * Homework 2.13.1
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть новий проект під назвою TestEnum. Додайте до нього пакет acad.prog.testenum.
 * 2. Створіть тип перерахування MyDayOfWeek, який визначає дні тижня (SUNDAY, MONDAY, …)
 * 3. Створіть клас Main з методом main, який перебирає можливі значення перерахування MyDayOfWeek у
 * циклі та друкує назву кожного значення на консолі.
 * 4. Виконайте програму.
 * Приклад виведення програми:
 * SUNDAY
 * MONDAY
 * TUESDAY
 * WEDNESDAY
 * THURSDAY
 * FRIDAY
 * SATURDAY
 * 5. Додайте до методу main() код, який перебирає можливі значення перерахування MyDayOfWeek у циклі
 * та використовуючи оператор switch, друкує дні тижня на консолі, лише якщо у вас є заняття з
 * програмування на Java.
 * Виконайте програму.
 * Приклад виведення програми:
 * Мій день Java: MONDAY
 * 6. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 17) лістинги
 * коду програми та результат їх роботи.
 */
public class Main {
    public static void main(String[] args) {
        //2.13.1
        for (MyDayOfWeek a: MyDayOfWeek.values()
        ) {
            System.out.println(a.name());
        }

        for (MyDayOfWeek a: MyDayOfWeek.values()
        ) {
            switch (a){
                case MONDAY -> System.out.println("Мій день Java: " + a);
                case TUESDAY ->{}
                case WEDNESDAY -> System.out.println("Мій день Java: " + a);
                case THURSDAY -> {}
                case FRIDAY -> {}
                case SATURDAY -> {}
                case SUNDAY -> {}
            }

        }
        //2.13.2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть день тижня англійською мовою: ");
        String day = scanner.nextLine();
        String DAY = day.toUpperCase();
        System.out.println("Наступний день тижня: " + MyDayOfWeek.valueOf(DAY).nextDay());

    }
}