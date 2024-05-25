package oop.lection9.hwbasetwo;

import java.util.Comparator;

public class StudentFirstNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student StudentOne = (Student) o1;
        Student StudentTwo = (Student) o2;

        String firstNameOne = StudentOne.getName();
        String firstNameTwo = StudentTwo.getName();

        if (firstNameOne.compareTo(firstNameTwo) > 0) {
            return 1;
        }
        if (firstNameOne.compareTo(firstNameTwo) < 0) {
            return -1;
        }
        return 0;
    }

}
