package acad.prog.oop.testshapes;


public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double p = (sideA + sideB + sideC) / 2;
        double triangleArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return triangleArea;
    }

    @Override
    public String toString() {
        return "This is Triangle, color is: " +
                color +
                ", sideA is: " +
                sideA +
                ", sideB is: " +
                sideB +
                ", sideC is: " +
                sideC + ", area is: " + String.format("%.2f",calcArea());
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
