package acad.prog.testexcp1;
public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super("помилкове значення віку");
    }
}
