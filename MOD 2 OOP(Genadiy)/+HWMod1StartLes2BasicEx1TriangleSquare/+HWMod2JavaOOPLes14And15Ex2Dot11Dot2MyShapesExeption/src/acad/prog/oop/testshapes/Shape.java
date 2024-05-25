package acad.prog.oop.testshapes;

import java.util.Arrays;

/**
 * @author Kolin Vyatkin
 * Hometask 2.11.2
 * 1. Відкрийте проект MyShapes. (з завдання 2.10). Створіть клас InvalidShapeStringException, який є підкласом
 * Exception, із конструктором без параметрів, який передає до конструктора суперкласу повідомлення про помилку у
 * рядку-опису фігури.
 * 3. Перепишіть метод “parseShape(String)” у класі “Shape”, щоб викликати InvalidShapeStringException, якщо рядок,
 * переданий як аргумент методу, є недійсним.
 * 	Приклад правильного рядка:
 * 	"Прямокутник:ЧЕРВОНИЙ:10,20";
 * 	Приклад недійсних рядків:
 * 	"ПрямокутникЧЕРВОНИЙ12”";
 * 	"sdzgdzhgd";
 * 4. Додайте код до методу main() у класі Main, який створює один прямокутник, один трикутник і одне коло за
 * допомогою методу Shape.parseShape(String) і обробляє (за допомогою try-catch) винятки, якщо вони виникають
 * (з виведенням повідомлення про помилку на консоль).
 * 5. Виконайте програму.
 * 6. Зазначте у документованому коментарі класів номер завдання, своє ім'я та прізвище.
 * 7. Надішліть викладачеві (до теми Java 12.10.2022 - IT Generation - Workshop Lesson 15) лістинги коду програм
 * та результат їх роботи.
 */

abstract class Shape implements Drawable, Comparable {
    protected String color;
    protected double area;

    public Shape(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        return Double.compare(this.calcArea(), shape.calcArea());
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public Shape(String color) {
        this.color = color;
    }

    abstract double calcArea();

    public static Shape parseShape(String str) throws InvalidShapeStringException {
        if (str.matches("^([А-Я])([а-я]+)\\:[А-Я]+\\:[0-9]+(\\,[0-9]+)*$")) {
            String[] result = str.split(":");
            String dimensions = result[2];
            double[] result2 = Arrays.stream(dimensions.split(",")).mapToDouble(Double::parseDouble).toArray();
            return switch (result[0]) {
                case "rectangle" -> new Rectangle(result[1], result2[0], result2[1]);
                case "triangle" -> new Triangle(result[1], result2[0], result2[1], result2[2]);
                case "circle" -> new Circle(result[1], result2[0]);
                default -> null;
            };
        } else {
            throw new InvalidShapeStringException();

        }
    }

    @Override
    public String toString() {
        return "colour is: " + color;
    }


}


