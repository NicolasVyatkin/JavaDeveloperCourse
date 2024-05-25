package acad.prog.oop.testshapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color is: " +
                color +
                ", radius is: " +
                radius + ", area is: " + String.format("%.2f",calcArea());
    }

    @Override
    public double calcArea() {
        double calcArea = Math.PI * radius * radius;
        return calcArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}