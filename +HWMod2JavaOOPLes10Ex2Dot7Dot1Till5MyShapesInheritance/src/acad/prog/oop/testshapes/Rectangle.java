package acad.prog.oop.testshapes;


public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        double calcArea = (length * width);
        return calcArea;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color is: " +
                color +
                ", length is: " +
                length +
                ", width is: " +
                width + ", area is: " + String.format("%.2f",calcArea());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
