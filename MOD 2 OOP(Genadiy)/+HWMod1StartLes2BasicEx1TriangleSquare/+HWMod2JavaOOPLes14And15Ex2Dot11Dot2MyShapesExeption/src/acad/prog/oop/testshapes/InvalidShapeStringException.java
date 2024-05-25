package acad.prog.oop.testshapes;

/**
 * @author Kolin Vyatkin
 * Hometask 2.11.2
 */

public class InvalidShapeStringException extends Exception{
    public InvalidShapeStringException() {
        super("Wrong shape description");
    }
}
