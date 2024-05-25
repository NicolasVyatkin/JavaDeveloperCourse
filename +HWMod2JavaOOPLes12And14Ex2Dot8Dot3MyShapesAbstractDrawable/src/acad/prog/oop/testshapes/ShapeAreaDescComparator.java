package acad.prog.oop.testshapes;

import java.util.Comparator;

/**
 * @author Kolin Vyatkin
 * Hometask 2.8.4
 */

public class ShapeAreaDescComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return Double.compare(shape2.area, shape1.area);
    }
}
