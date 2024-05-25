package oop.lection3.hwbaseadv;

import java.util.Comparator;


public class StudentIDComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student studentOne = (Student) o1;
        Student studentTwo = (Student) o2;
        int idOne = studentOne.getId();
        int idTwo = studentTwo.getId();
        if (idOne > idTwo) {
            return 1;
        }
        if (idOne < idTwo) {
            return -1;
        }
        return 0;
    }
}
