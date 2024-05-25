package acad.prog.oop.testshapes;

import java.util.Arrays;

/**
 * Class that calculates areas of geometric shapes, prints their colors.
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * Практичне завдання - 2.8.4 - Заняття 12
 * 1. Реалізуйте абстрактним класом Shape інтерфейс Comparable так, щоб він порівнював фігури за значенням їх площ.
 * 2. Створіть ще один прямокутник з іншими розмірами та виведіть на екран результати порівняння двох прямокутників.
 * 3. Виконайте сортування фігур у масиві за зростанням значення їх площ. Виведіть на екран елементи отсортованого
 * масиву.
 * 4. Створіть об'єкт класу ShapeAreaDescComparator, який реалізує інтерфейс Comparator та дозволяє сортувати масив
 * фігур за зменшенням значення їх площ. Відсортуйте масив з такм компаратором та виведіть на екран елементи  отсортованого масиву.
 * 5. Зазначте у документованому коментарі класів їх призначення, номер завдання, а також своє ім'я та прізвище.
 * 6. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 12) лістинги коду програм
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("blue", 20, 10);
        Rectangle rectangle2 = new Rectangle("green", 10, 10);
        Circle circle1 = new Circle("red", 5);
        Circle circle2 = new Circle("grey", 9);
        Triangle triangle1 = new Triangle("pink", 20, 16, 15);
        Triangle triangle2 = new Triangle("yellow", 21, 20, 22);

        System.out.println("Comparing 2 rectangles: " + rectangle1.compareTo(rectangle2));

        System.out.println("\n-- Compare to --");
        Shape[] shapes = {rectangle1, rectangle2, circle1, circle2, triangle1, triangle2};
        Arrays.sort(shapes);
        for (Shape shape1 : shapes) {
            shape1.draw();
        }

        System.out.println("\n-- Comparator --");
        Arrays.sort(shapes, new ShapeAreaDescComparator());
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
    }
}

