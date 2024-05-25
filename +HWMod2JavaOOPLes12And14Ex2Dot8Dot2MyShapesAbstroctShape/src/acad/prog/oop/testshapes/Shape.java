package acad.prog.oop.testshapes;

import java.util.Arrays;

/**
 * @author Kolin Vyatkin
 * Hometask 2.8.2
 */

abstract class Shape{
    protected String color;
    protected double area;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        return "colour is: " + color;
    }


    //2.10.1
    /**1. Відкрийте проект MyShapes з завдання 2.8.4.
            2. Додайте до класу Shape статичний метод під назвою parseShape(String), який повертає новий
     об’єкт-спадкоємець Shape на основі рядка, переданого як аргумент.
    Приклади можливих рядків:
            "Прямокутник:ЧЕРВОНИЙ:10,20";
"Трикутник:ЗЕЛЕНИЙ:9,7,12";
"Коло:ЧОРНЕ:10".
        3. У методі parseShape() ви повинні виконати такі дії (використовуйте оператор switch):
            - визначити тип фігури на основі першої частини рядка;
- визначити колір фігури на основі другої частини рядка;
- визначити та отримати числові значення з третьої частини рядка та використати їх як аргументи для
     створення об’єкта відповідної фігури.
4. Додайте до методу main класу Main код, що створює один прямокутник, один трикутник і одне коло за
     допомогою методу parseShape(String).
     */
    public static Shape parseShape(String str) {

        String[] params = str.split(" *: *");
        double[] size = Arrays.stream(params[2].split(" *, *")).mapToDouble(Double::parseDouble).toArray();

        return switch (params[0].toLowerCase()) {
            case "коло" -> new Circle(params[1], size[0]);
            case "прямокутник" -> new Rectangle(params[1], size[0], size[1]);
            case "трикутник" -> new Triangle(params[1], size[0], size[1], size[2]);
            default -> null;
        };
    }


}