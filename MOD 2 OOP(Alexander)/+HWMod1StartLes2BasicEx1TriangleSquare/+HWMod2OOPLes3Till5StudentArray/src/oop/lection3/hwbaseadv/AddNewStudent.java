package oop.lection3.hwbaseadv;

import java.util.Scanner;

public class AddNewStudent {

    public static String readName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name of the student: ");
        return sc.nextLine();
    }

    public static String readLastName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input last name of the student: ");
        return sc.nextLine();
    }

    public static String readGender() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input gender of the student(" +Gender.man +" or "+Gender.woman +"): ");
        return sc.nextLine();
    }

    public static int readID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID of the student: ");
        return sc.nextInt();
    }

    public static String readGroupName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input group name of the student: ");
        return sc.nextLine();
    }

    public Student createStudentFromKeyboard() {
        return new Student(readName(), readLastName(), Gender.valueOf(readGender()), readID(), readGroupName());
    }

    public boolean addStudentToGroup(Student newStudent, Group group) {
        try {
            group.addStudent(newStudent);
            return true;
        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
