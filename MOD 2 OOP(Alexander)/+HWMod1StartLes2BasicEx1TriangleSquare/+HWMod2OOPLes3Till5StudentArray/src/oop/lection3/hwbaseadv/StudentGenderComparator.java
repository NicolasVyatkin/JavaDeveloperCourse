package oop.lection3.hwbaseadv;

import java.util.Comparator;

public class StudentGenderComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student StudentOne = (Student) o1;
        Student StudentTwo = (Student) o2;

        String genderOne = String.valueOf(StudentOne.getGenderType());
        String genderTwo = String.valueOf(StudentTwo.getGenderType());

        if (genderOne.compareTo(genderTwo) > 0) {
            return 1;
        }
        if (genderOne.compareTo(genderTwo) < 0) {
            return -1;
        }
        return 0;
    }

}
