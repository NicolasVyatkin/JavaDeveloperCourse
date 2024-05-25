package acad.prog.oop.testshapes;

public class Shape {
    protected String color;


    public double calcArea() {
        double aria = 0.0;
        return aria;
    }

    @Override
    public String toString() {
        return "This is Shape, color is: "
                + color;
    }

    public Shape(String color) {
        this.color = color;
    }

    static class Circle extends Shape {
        public Circle(String color) {
            super(color);
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        private double radius;

        @Override
        public String toString() {
            return "This is Circle, color is: " + color +
                    ", radius is: " + radius +
                    ", aria of the circle is: " + String.format("%.2f", calcArea(radius));
        }

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
            this.color = color;
        }

        public double calcArea(double rad) {
            double aria = Math.PI * rad * rad;
            return aria;
        }
    }

    static class Rectangle extends Shape {
        public Rectangle(String color) {
            super(color);
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

        private double length;
        private double width;

        @Override
        public String toString() {
            return "This is Rectangle, color is: " + color +
                    ", length is: " + length +
                    ", width is: " + width +
                    ", aria of the rectangle is: " + String.format("%.2f", calcArea(length, width));
        }

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
            this.color = color;
        }

        public double calcArea(double length, double width) {
            double aria = width * length;
            return aria;
        }
    }

    static class Triangle extends Shape {
        public Triangle(String color) {
            super(color);
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

        private double sideA;
        private double sideB;
        private double sideC;

        @Override
        public String toString() {
            return "This is Triangle, color is: " + color +
                    ", sideA is: " + sideA +
                    ", sideB is: " + sideB +
                    ", sideC is: " + sideC +
                    ", aria of the triangle is: " + String.format("%.2f", calcArea(sideA, sideB, sideC));
        }

        public Triangle(String color, double sideA, double sideB, double sideC) {
            super(color);
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;

        }

        public double calcArea(double sideA, double sideB, double sideC) {
            double p = (sideA + sideB + sideC) / 2;
            double aria = Math.sqrt(p * (p - sideA) * (p - sideB) * p - sideC);
//            System.out.println(", aria of the triangle is: "+aria);
            return aria;
        }




}}
