package acad.prog.oop.testshapes;

/**
 * Class that calculates areas of geometric shapes, prints their colors.
 * Tasks 2.7.1-2.7.5
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * Практичне завдання - 2.7.1 - Заняття 10
 * 1. Створіть новий проект під назвою MyShapes. Додайте пакет acad.prog.oop.testshapes.
 * 2. Створіть публічний суперклас Shape, який визначає метод під назвою calcArea(), що повертає
 * площу фігури (0.0 для об'єктів Shape).(Програма використовуватиме різні види фігур, таких як
 * трикутник, прямокутник тощо.)
 * 3. В класі Shape оголосіть поле color типу String з модифікатором видимості protected
 * (гетер та сетер для цого поля задавати не потрібно).
 * 4. Створіть конструктор для Shape з параметром color.
 * 5. Перевизначте метод toString(), щоб повернути рядок з назви фігури та кольору, для класу
 * Shape: "This is Shape, color is: назва_кольору"
 * 6. Створіть клас Main з методом main, у якому продемонструйте створення об’єкта Shape і
 * виведення його назви та кольору на екран.
 * <p>
 * Практичне завдання - 2.7.2 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Circle, який є підкласом Shape.
 * 2. Додайте до класу Circle поле radius типу double та виконайте його інкасуляцію з
 * доданням стандартних геттера та сеттера.
 * 3. Додайте до класу конструктор з аргументами color та radius.
 * 4. У класі Circle перевизначте метод calcArea(), який має повертати площу кола.
 * 5. У класі Circle перевизначте метод toString(). Він повинен повертати рядок, який містить
 * назву фігури, колір і радіус кола, наприклад: "This is Circle, color is: назва_кольору, radius
 * is: значення_радіусу"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Circle і виводить на екран
 * його назву, колір та радіус, також додайте код виклику методу calcArea() і виведення площі кола на консоль.
 * <p>
 * Практичне завдання - 2.7.3 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Rectangle, який є підкласом Shape.
 * 2. Додайте до класу Rectangle поля length та width типу double та виконайте їх інкасуляцію з
 * доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, length та width.
 * 4. У класі Rectangle перевизначте метод calcArea(), який має повертати площу прямокутника.
 * 5. У класі Rectangle перевизначте метод toString(). Він повинен повертати рядок, який містить
 * назву фігури, колір, довжину та ширину, наприклад: "This is Rectangle, color is: назва_кольору,
 * length is: значення_довжини, width is: значення_ширини"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Rectangle і виводить на екран його
 * назву, колір, довжину та ширину, також додайте код виклику методу calcArea() і виведення площі
 * прямокутника на консоль.
 * <p>
 * Практичне завдання - 2.7.4 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Triangle, який є підкласом Shape.
 * 2. Додайте до класу Triangle поля sideA та sideB та sideC типу double та виконайте їх інкасулцію з
 * доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, sideA, sideB та sideC.
 * 4. У класі Triangle перевизначте метод calcArea(), який має повертати площу трикутника, розраховану
 * через довжини сторін (за формулою Герона).
 * 5. У класі Triangle перевизначте метод toString(). Він повинен повертати рядок, який містить назву фігури,
 * колір та значення сторін, наприклад: "This is Triangle, color is: назва_кольору, sideA is:
 * значення_сторони_A, sideB is: значення_сторони_B, sideC is: значення_сторони_C"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Triangle і виводить на екран його
 * назву, колір та сторони, також додайте код виклику методу calcArea() і виведення площі трикутника
 * на консоль.
 * <p>
 * Практичне завдання - 2.7.5 - Заняття 10
 * 1. У методі main класу Main створіть масив об'єктів підкласів класу Shape: два прямокутники, два кола
 * та два трикутники.
 * 2. Додайте код для перебору масиву фігур у циклі (використовуйте цикл for-each) та виводу на екран
 * характеристик кожної фігури (за допомогою методу “toString()”) та значення площі фігури (за допомогою
 * методу “calcArea()”).
 * 3. Додайте код для обчислення сумарної площі всіх фігур масиву.
 * 4. Додайте код для обчислення сумарних площ для кожного типу фігури (використовуйте оператор instanceof
 * для визначення належності об'єкта до класу).
 */

public class Main {
    public static void main(String[] args) {

        double totalArea = 0;
        double totalAreaRectangles = 0;
        double totalAreaCircles = 0;
        double totalAreaTriangles = 0;

        Circle circle1 = new Circle("red", 5);
        Rectangle rectangle1 = new Rectangle("blue", 12, 15);
        Triangle triangle1 = new Triangle("pink", 20, 16, 15);
        Circle circle2 = new Circle("grey", 9);
        Rectangle rectangle2 = new Rectangle("green", 10, 18);
        Triangle triangle2 = new Triangle("yellow", 21, 20, 22);

        System.out.println("\n-- Array of shapes --");
        Shape[] shapes = {rectangle1, rectangle2, circle1, circle2, triangle1, triangle2};

        for (Shape shape1 : shapes) {
            System.out.println(shape1.toString() + ". Area is: " + shape1.calcArea());
            totalArea += shape1.area;
            if (shape1 instanceof Rectangle) {
                totalAreaRectangles += shape1.area;
            }
            if (shape1 instanceof Circle) {
                totalAreaCircles += shape1.area;
            }
            if (shape1 instanceof Triangle) {
                totalAreaTriangles += shape1.area;
            }
        }

        System.out.println("\n-- Total areas--");
        System.out.println("Total area of all shapes: " + totalArea);
        System.out.println("Total area of all rectangles: " + totalAreaRectangles);
        System.out.println("Total area of all circles: " + totalAreaCircles);
        System.out.println("Total area of all triangles: " + totalAreaTriangles);


        //2.10.1
        System.out.println(Shape.parseShape("Прямокутник : ЧЕРВОНИЙ : 10, 20"));
        System.out.println(Shape.parseShape("Трикутник : ЗЕЛЕНИЙ : 9, 7, 12"));
        System.out.println(Shape.parseShape("Коло : ЧОРНЕ : 10"));
    }
}

