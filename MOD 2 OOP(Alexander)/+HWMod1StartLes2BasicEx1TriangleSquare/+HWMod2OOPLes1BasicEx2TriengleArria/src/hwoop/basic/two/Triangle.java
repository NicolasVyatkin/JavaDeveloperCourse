package hwoop.basic.two;

public class Triangle {

    private double sideOne;
    private double sideTwo;
    private double sideThree;


    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public Triangle() {
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double calcArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        double triangleArea = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
        return triangleArea;
    }

    @Override
    public String toString() {
        return
                "Первая сторона треугольника - " + sideOne +
                ", вторая сторона треугольника - " + sideTwo +
                ", третья сторона треугольника - " + sideThree +
                ", площадь треугольника - " + String.format("%.2f",calcArea());
    }
}
