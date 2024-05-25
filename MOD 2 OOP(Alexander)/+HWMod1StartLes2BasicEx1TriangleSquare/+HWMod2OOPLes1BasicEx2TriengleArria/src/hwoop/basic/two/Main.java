package hwoop.basic.two;

import java.util.Scanner;
/**
 * @author Kolin Vyatkin
 */

public class Main {
    public static void main(String[] args) {
        /*
            Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника.
        Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте
        несколько объектов этого класса и протестируйте их.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длины сторон треугольника: ");
        double sideOne = sc.nextDouble();
        double sideTwo = sc.nextDouble();
        double sideThree = sc.nextDouble();

        Triangle[] trianglesList = {
                new Triangle(sideOne, sideTwo, sideThree),
                new Triangle(sideOne*2, sideTwo*3, sideThree*2),
        };
        for (Triangle figure : trianglesList) {
            System.out.println(figure);
        }
    }
}