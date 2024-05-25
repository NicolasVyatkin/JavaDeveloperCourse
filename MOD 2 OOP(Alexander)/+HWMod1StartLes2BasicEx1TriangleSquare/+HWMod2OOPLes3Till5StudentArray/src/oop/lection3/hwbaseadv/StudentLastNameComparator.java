package oop.lection3.hwbaseadv;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student StudentOne = (Student) o1;
        Student StudentTwo = (Student) o2;

        String lastNameOne = StudentOne.getLastName();
        String lastNameTwo = StudentTwo.getLastName();

        if (lastNameOne.compareTo(lastNameTwo) > 0) {
            return 1;
        }
        if (lastNameOne.compareTo(lastNameTwo) < 0) {
            return -1;
        }
        return 0;
    }

}
