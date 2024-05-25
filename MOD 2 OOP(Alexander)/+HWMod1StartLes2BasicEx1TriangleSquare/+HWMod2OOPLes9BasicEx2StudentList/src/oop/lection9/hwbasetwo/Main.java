
package oop.lection9.hwbasetwo;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        Group test = new Group("Test", 10);

        test.addStudent(new Student("Natalia", "O'Shay", Gender.woman, 101, "Test"));
        test.addStudent(new Student("Sergey", "Vishnyakov", Gender.man, 102, "Test"));
        test.addStudent(new Student("Dmitry", "Frolov", Gender.man, 103, "Test"));
        test.addStudent(new Student("Roman", "Bondar", Gender.man, 104, "Test"));
        test.addStudent(new Student("Ulii", "Teslar", Gender.man, 105, "Test"));
        test.addStudent(new Student("Dmitriy", "Dolya", Gender.man, 106, "Test"));
        test.addStudent(new Student("Svetlana", "Serdyk", Gender.woman, 107, "Test"));
        test.addStudent(new Student("Mariya", "Zeleznyak", Gender.woman, 108, "Test"));
        test.addStudent(new Student("Kuzma", "Kyzmenko", Gender.man, 109, "Test"));
        test.addStudent(new Student("Iren", "Adler", Gender.woman, 110, "Test"));


//        test.searchStudentByLastName("Vishnyako");
//        test.removeStudentById(101);
        // Add new student from te keyboard
//        CreateStudentFromKeyboard rc = new CreateStudentFromKeyboard();
//        test.addStudent(rc.createStudentFromKeyboard());

        //Save and load group to/from file
        GroupFileStorage gr = new GroupFileStorage();
        gr.saveGroupToCSV(test);
//        File fileForLoad = new File("test.csv");
//        System.out.println(gr.loadGroupFromCSV(fileForLoad));


    }
}

