package acad.prog.oop.testshapes;


public class Shape {
    protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "This is Shape, color is:" +
                color;
    }

    public double calcArea () {
        double calcArea = 0;
        return calcArea;
    }

}