package acad.prog.oop.testshapes;
/**
 * Class that calculates areas of geometric shapes, prints their colors.
 * Tasks 2.7.1-2.7.5
 *
 * @author Kolin Vyatkin
 * @version 1.0
 *          Практичне завдання - 2.7.1 - Заняття 10
 * 1. Створіть новий проект під назвою MyShapes. Додайте пакет acad.prog.oop.testshapes.
 * 2. Створіть публічний суперклас Shape, який визначає метод під назвою calcArea(), що повертає
 *      площу фігури (0.0 для об'єктів Shape).(Програма використовуватиме різні види фігур, таких як
 *      трикутник, прямокутник тощо.)
 * 3. В класі Shape оголосіть поле color типу String з модифікатором видимості protected
 *      (гетер та сетер для цого поля задавати не потрібно).
 * 4. Створіть конструктор для Shape з параметром color.
 * 5. Перевизначте метод toString(), щоб повернути рядок з назви фігури та кольору, для класу
 *      Shape: "This is Shape, color is: назва_кольору"
 * 6. Створіть клас Main з методом main, у якому продемонструйте створення об’єкта Shape і
 *      виведення його назви та кольору на екран.
 *
 *          Практичне завдання - 2.7.2 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Circle, який є підкласом Shape.
 * 2. Додайте до класу Circle поле radius типу double та виконайте його інкасуляцію з
 *      доданням стандартних геттера та сеттера.
 * 3. Додайте до класу конструктор з аргументами color та radius.
 * 4. У класі Circle перевизначте метод calcArea(), який має повертати площу кола.
 * 5. У класі Circle перевизначте метод toString(). Він повинен повертати рядок, який містить
 *      назву фігури, колір і радіус кола, наприклад: "This is Circle, color is: назва_кольору, radius
 *      is: значення_радіусу"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Circle і виводить на екран
 *      його назву, колір та радіус, також додайте код виклику методу calcArea() і виведення площі кола на консоль.
 *
 *          Практичне завдання - 2.7.3 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Rectangle, який є підкласом Shape.
 * 2. Додайте до класу Rectangle поля length та width типу double та виконайте їх інкасуляцію з
 *      доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, length та width.
 * 4. У класі Rectangle перевизначте метод calcArea(), який має повертати площу прямокутника.
 * 5. У класі Rectangle перевизначте метод toString(). Він повинен повертати рядок, який містить
 *      назву фігури, колір, довжину та ширину, наприклад: "This is Rectangle, color is: назва_кольору,
 *      length is: значення_довжини, width is: значення_ширини"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Rectangle і виводить на екран його
 *      назву, колір, довжину та ширину, також додайте код виклику методу calcArea() і виведення площі
 *      прямокутника на консоль.
 *
 *          Практичне завдання - 2.7.4 - Заняття 10
 * 1. Додайте до проекту MyShapes клас Triangle, який є підкласом Shape.
 * 2. Додайте до класу Triangle поля sideA та sideB та sideC типу double та виконайте їх інкасулцію з
 *      доданням стандартних геттерів та сеттерів.
 * 3. Додайте до класу конструктор з аргументами color, sideA, sideB та sideC.
 * 4. У класі Triangle перевизначте метод calcArea(), який має повертати площу трикутника, розраховану
 *      через довжини сторін (за формулою Герона).
 * 5. У класі Triangle перевизначте метод toString(). Він повинен повертати рядок, який містить назву фігури,
 *      колір та значення сторін, наприклад: "This is Triangle, color is: назва_кольору, sideA is:
 *      значення_сторони_A, sideB is: значення_сторони_B, sideC is: значення_сторони_C"
 * 6. Додайте до коду метода main класу Main, код, що створює об’єкт Triangle і виводить на екран його
 *      назву, колір та сторони, також додайте код виклику методу calcArea() і виведення площі трикутника
 *      на консоль.
 *
 *          Практичне завдання - 2.7.5 - Заняття 10
 * 1. У методі main класу Main створіть масив об'єктів підкласів класу Shape: два прямокутники, два кола
 *      та два трикутники.
 * 2. Додайте код для перебору масиву фігур у циклі (використовуйте цикл for-each) та виводу на екран
 *      характеристик кожної фігури (за допомогою методу “toString()”) та значення площі фігури (за допомогою
 *      методу “calcArea()”).
 * 3. Додайте код для обчислення сумарної площі всіх фігур масиву.
 * 4. Додайте код для обчислення сумарних площ для кожного типу фігури (використовуйте оператор instanceof
 *      для визначення належності об'єкта до класу).
 */

public class Main {
    public static void main(String[] args) {
        Shape shapeOne = new Shape("yellow");
        System.out.println(shapeOne);

        Circle circleOne = new Circle("green", 10.5);
        System.out.println(circleOne);

        Rectangle rectangleOne = new Rectangle("yelow", 10.5, 15.6);
        System.out.println(rectangleOne);

        Triangle triangleOne = new Triangle("blur", 10.5, 15.6, 12.4);
        System.out.println(triangleOne);

        System.out.println("\nInformation on objects of [] shapeArr: ");

        Shape[] shapeArr = {
                new Rectangle("yelow", 10.5, 15.6),
                new Rectangle("orange", 3, 4),
                new Circle("green", 10.5),
                new Circle("orange", 13.5),
                new Triangle("blur", 10.5, 15.6, 12.4),
                new Triangle("pink", 13.5, 17.6, 14.4)
        };

        for (Shape shape : shapeArr) {
            System.out.println(shape);
        }

        double sum = 0;
        for (Shape shape : shapeArr) {
            sum += shape.calcArea();
        }
        System.out.println("\nSum of areas of all shapes in the shapeArr massive = " + String.format("%.2f",sum));

        double sumRectangle = 0;
        double sumCircle = 0;
        double sumTriangle = 0;
        for (int i = 0; i < shapeArr.length; i++) {
            if (shapeArr [i] instanceof Rectangle){
                sumRectangle += shapeArr [i].calcArea();
            } else if (shapeArr [i] instanceof Circle){
                sumCircle += shapeArr [i].calcArea();
            } else {
                sumTriangle += shapeArr [i].calcArea();
            }
        }
        System.out.println("The sum of Rectangle areas ="+String.format("%.2f",sumRectangle));
        System.out.println("The sum of Circle areas ="+String.format("%.2f",sumCircle));
        System.out.println("The sum of Triangle areas ="+String.format("%.2f",sumTriangle));
    }
}