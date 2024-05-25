package acad.prog.oop.testshapes;

/**
 * Class that calculates areas of geometric shapes, prints their colors.
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * Практичне завдання - 2.8.3 - Заняття 12
 * 1. Додайте до проекту MyShapes інтерфейс Drawable з абстрактним методом void draw().
 * 2. Реалізуйте абстрактний метод інтерфейсу у класі Shape так, щоб він виводив на екран назву та характеристики кожної з фігур підкласів, а також площу цієї фігури, нариклад, так:
 * This is Circle, color is: GREEN, radius=10.0 - area: 314.1592653589793
 * 3. Додайте до методу main коасу Main код, що перебирає масив фігур у циклі (використовуйте цикл for-each) і викликає для кожної метод draw().
 * 4. Зазначте у документованому коментарі класів їх призначення, номер завдання, а також своє ім'я та прізвище.
 * 5. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 12) лістинги коду програм
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("blue", 12, 15);
        Rectangle rectangle2 = new Rectangle("green", 10, 18);
        Circle circle1 = new Circle("red", 5);
        Circle circle2 = new Circle("grey", 9);
        Triangle triangle1 = new Triangle("pink", 20, 16, 15);
        Triangle triangle2 = new Triangle("yellow", 21, 20, 22);

        System.out.println("\n-- Array of shapes --");
        Shape[] shapes = {rectangle1, rectangle2, circle1, circle2, triangle1, triangle2};
        for (Shape shape1 : shapes) {
            shape1.draw();
        }
    }
}

