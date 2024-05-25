package oop.lection9.hwbasetwo;

import java.util.*;
import java.util.ArrayList;

public class Group {

    private String groupName;

    List<Student> students = new ArrayList<Student>();
    private int places;

    public Group(String groupName, int places) {
        this.groupName = groupName;
        this.places = places;
    }

    public Group() {

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        try {
            if (students.size() >= places) {
                throw new GroupOverflowExeption();
            } else {
                students.add(student);
            }
        } catch (GroupOverflowExeption e) {
            System.err.println(e.getMessage());
        }
    }

    //remove student by last name

    public void removeStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName().equals(lastName)) {
                students.remove(i);
                System.out.println("Student with last name " + lastName + " was removed successfully");
                return;
            }
        }
        throw new StudentNotFoundException("There is no student with last name "
                + lastName + " in the " + groupName + " group!");
    }

    //remove student by id

    public void removeStudentById(int id) throws StudentNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == (id)) {
                students.remove(i);
                System.out.println("Student with id "
                        + id + " was removed successfully");
                return;
            }
        }
        throw new StudentNotFoundException("There is no student with id "
                + id + " in the " + groupName + " group!");
    }

    //find student by last name

    public void searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName().equals(lastName)) {
                System.out.println(students.get(i));
                return;
            }
        }
        throw new StudentNotFoundException("There is no student with last name " + lastName
                + " in the " + groupName + " group!");
    }

    //sort students by last name

    public List<Student> sortStudentsByLastName() {
        students.sort(new StudentLastNameComparator());
        return students;
    }

//    //Реализуйте вспомогательный метод для проверки факта отсутствия эквивалентных
//    //студентов в группе.
//    public String CheckEqualStudentsInGroup(){
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null){
//                for (int j = i + 1; j < students.length; j++) {
//                    if (students[i].equals(students[j]))
//                        return "Student "+students[i]+" equal "+students[j];
//                }
//            }
//        }
//        return "All students in group "+groupName+ " are unique persons";
//    }

    @Override
    public String toString() {
        String result =
                "Studens of the " + groupName + " group are: " + System.lineSeparator();
        for (int i = 0; i < students.size(); i++) {
            if (students != null) {
                result += students.get(i) + System.lineSeparator();
            }
        }
        return result;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Group group = (Group) o;
//        return Objects.equals(groupName, group.groupName) && Arrays.equals(students, group.students);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(groupName);
//        result = 31 * result + Arrays.hashCode(students);
//        return result;
//    }
}
