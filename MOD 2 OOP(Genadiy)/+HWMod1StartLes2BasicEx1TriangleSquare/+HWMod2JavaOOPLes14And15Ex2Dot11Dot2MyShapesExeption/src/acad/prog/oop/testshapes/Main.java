package acad.prog.oop.testshapes;

/**
 * Class that calculates areas of geometric shapes, prints their colors.
 *
 * @author Kolin Vyatkin
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Shape.parseShape("Прямокутник:ЧЕРВОНИЙ:10,20"));
        } catch (InvalidShapeStringException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Shape.parseShape("ПрямокутникЧЕРВОНИЙ12"));
        } catch (InvalidShapeStringException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println(Shape.parseShape("sdzgdzhgd"));
        } catch (InvalidShapeStringException e) {
            System.err.println(e.getMessage());
        }
    }
}

