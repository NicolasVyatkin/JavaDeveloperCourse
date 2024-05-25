package acad.prog.testmygen;
/**
 * Homework 2.15.4 + 2.15.5
 * @author Kolin Vyatkin
 * @version 1.0
 * 2.15.4
 * 1. Створіть новий проект під назвою TestMyGenerator. Додайте пакет acad.prog.testmygen.
 * 2. Створіть клас MyNumGenerator із двома полями: numOfElm і maxNumb типу int, конструктором із двома
 * параметрами та методом generate(), який повертає нову колекцію (типу List) із довжиною numOfElm,
 * заповненою випадковими числами від 0 до maxNumb (включно обидві границі).
 * 3. Створіть клас Main з методом main(). Додайте код методу main(), що створює екземпляр MyNumGenerator
 * і виводить результат виклику методу generate() на консоль.
 * 4. Виконайте програму.
 * Результат програми (наприклад, для параметрів 10, 5) повинен виглядати, наприклад:
 * [1, 2, 2, 4, 1, 0, 4, 5, 1, 3]
 * 5. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 6. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 20) лістинги коду
 * програми та результат їх роботи.
 * 2.15.5
 * 1. Відкрийте проект під назвою TestMyGenerator.
 * 2. Додайте до класу MyNumGenerator новий метод generateDistinct(), який повертає нову колекцію (типу Set)
 * із довжиною numOfElm і заповненою випадковими числами без повторюваних значень від 0 до maxNumb (включно
 * обидві границі).
 * 3. Додайте до методу main() класу Main код, що створює екземпляр MyNumGenerator і виводить результат виклику
 * методу generateDistinct() на консоль.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator num1 = new MyNumGenerator(10, 5);
        System.out.println(num1.generate());
        MyNumGenerator num2 = new MyNumGenerator(10, 5); //завдання 2.15.6
        System.out.println("Set of random distinct Integers:" +"\n/" + num2.generateDistinct());
    }
}