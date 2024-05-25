package oop.lection3.hwbaseadv;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {
    private String groupName;

    private Student[] students = new Student[10];// create new Student array, 10 persons

    public Group(String groupName, Student[] students) {
        super();
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
        super();
    }
//    private final Student[] students;
//    Scanner sc = new Scanner(System.in);
//
//    public Group(String groupName) {
//        this.groupName = groupName;
//        students = new Student[10];
//    }
//
//    public Group() {
//        students = new Student[10];
//    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }



    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }

        }
        throw new GroupOverflowException("Группа уже полна");
    }

    ;//throws GroupOverflowException

    //    (метод добавления студента в группу. В случае добавления 11 студента
//    должно быть возбужденно пользовательское исключение)
    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getLastName() == lastName) {
                    return students[i];
                }
            }
        }
        throw new StudentNotFoundException("There is student with "+lastName+" in the " + groupName+ " group!");
    }


    ;;//throws StudentNotFoundException
//    (метод поиска студента в группе.
//    Если студент не найден должно быть возбужденно пользовательское исключение)

    public boolean removeStudentByID(int id) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == id) {
                    students[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    ;;
//    (метод удаления студента по номеру зачетки, вернуть true если такой студент был и он
//    был удален и false в противном случае)


    public Student[] sortStudentsByLastName() {
        Arrays.sort(students, Comparator.nullsLast(new StudentLastNameComparator()));
        return students;
    }

    //Реализуйте вспомогательный метод для проверки факта отсутствия эквивалентных
    //студентов в группе.
    public String CheckEqualStudentsInGroup(){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                for (int j = i + 1; j < students.length; j++) {
                    if (students[i].equals(students[j]))
                        return "Student "+students[i]+" equal "+students[j];
                }
            }
        }
        return "All students in group "+groupName+ " are unique persons";
    }

    @Override
    public String toString() {
        String result = "groupName='" + groupName + '\'' +
                ", studens=" + System.lineSeparator();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                result += students[i] + System.lineSeparator();
            }

        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(groupName, group.groupName) && Arrays.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupName);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
