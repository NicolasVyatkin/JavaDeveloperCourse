package les2.basicex1;

/**
 * 1)Написать программу которая вычислит и выведет на экран площадь треугольника если
 * известны его стороны (sideA = 0.3, sideB = 0.4, sideC = 0.5). Для вычисления
 * использовать формулу Герона.
 */

public class Main {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        double p = (sideA + sideB + sideC) / 2;
        double triangleArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));


        System.out.println("The aria of the triangle with sides side a = " + sideA+", side b = "
                +sideB+", side c = "+sideC+" counted by Geron formula is "+triangleArea);
    }


}