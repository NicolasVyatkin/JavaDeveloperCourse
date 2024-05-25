package acad.prog.oop.testshapes;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red");
        Shape.Circle myCircle = new Shape.Circle("green", 10.5);
        Shape.Circle myCircle1 = new Shape.Circle("orange", 13.5);
        Shape.Rectangle myRectangle = new Shape.Rectangle("yelow", 10.5, 15.6);
        Shape.Rectangle myRectangle1 = new Shape.Rectangle("blue", 13.5, 17.6);
        Shape.Triangle myTriangle = new Shape.Triangle("blur", 10.5, 15.6, 12.4);
        Shape.Triangle myTriangle1 = new Shape.Triangle("pink", 13.5, 17.6, 14.4);

        Shape[] shapes = {myCircle, myCircle1, myRectangle, myRectangle1, myTriangle, myTriangle1};

        System.out.println("Task 2.7.5");


        for (Shape printShape : shapes) {

            System.out.println(printShape);
        }


        System.out.println("Task 2.7.1-2.7.4");

        System.out.println(shape.toString());
        System.out.println(myCircle.toString());
        System.out.println(myRectangle.toString());
        System.out.println(myTriangle.toString());


    }}
