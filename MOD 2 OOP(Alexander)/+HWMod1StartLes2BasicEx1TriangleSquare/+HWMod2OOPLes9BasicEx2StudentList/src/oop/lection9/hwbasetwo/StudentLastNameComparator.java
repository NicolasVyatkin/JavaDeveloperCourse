package oop.lection9.hwbasetwo;

import java.util.Comparator;
public class StudentLastNameComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        String secondName1 = student1.getLastName();
        String secondName2 = student2.getLastName();

        if (secondName1.compareTo(secondName2) > 0) {
            return 1;
        } else if (secondName1.compareTo(secondName2) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
