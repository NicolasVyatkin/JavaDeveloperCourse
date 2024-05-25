package com.gmail.niglasksend.progacademy.lesson8hw2_1;
/**
 * Class that discribes a computer
 *
 * @author Kolin Vyatkin
 * @version 1.0
 */
 public class HW2_1 {
    public static void main(final String[] args) {

        final List subjects = new List(new String[]{"Physics", "Math", "English"});

        final Student Yurii = new Student("1", "Yurii", 1, true, 20);
        final Student Billy = new Student("2","Billy", 3, true, 19);
        final Student Van = new Student("3","Van", 2, false, 22);

        subjects.addStudent(Yurii);
        subjects.addStudent(Billy);
        subjects.addStudent(Van);


        subjects.setMark( "1","English", 4);//Yurii
        subjects.setMark( "1","Math", 4);
        subjects.setMark( "1","Physics", 2);

        subjects.setMark( "2","English", 3);//Billy
        subjects.setMark( "2","Math", 5);
        subjects.setMark( "2","Physics", 4);

        subjects.setMark( "3","English", 4);//Van
        subjects.setMark( "3","Math", 2);
        subjects.setMark( "3","Physics", 5);

        subjects.infoAboutStudents();// display all info about students
        System.out.println();

        System.out.println("added new subject OOP ");
        System.out.println();

        subjects.addSubject("OOP");//add new subject

        subjects.setMark( "1","OOP", 5);//added mark to a new subject
        subjects.setMark( "2","OOP", 4);
        subjects.setMark( "3","OOP", 5);

        subjects.infoAboutStudents();
        System.out.println();

        System.out.println("highest average grades");
        subjects.getHighestAverageScore();  //the highest average score
        System.out.println();

        System.out.println("map");
        System.out.println(subjects.getGrades("English"));


    }

}
