/*
                LESSON 3
      1) Создать класс Human.
        Поля:
            ● String name (имя)
            ● String lastName (фамилия)
            ● Gender gender (пол. Реализовать с помощью Enum)
        Методы:
            ● Стандартные (методы получения и установки, toString() и т. д.)
       2) Создать класс Student как подкласс Human.
        Поля:
            ● int id (номер зачетки)
            ● String groupName (название группы где он учится)
        Методы:
            ● Стандартные (методы получения и установки, toString() и т. д.)
       3) Создать классы GroupOverflowException, StudentNotFoundException (наследники Exception) в
       качестве пользовательских исключений.
       4) Создать класс Group
        Поля:
            ● String groupName (название)
            ● Student[] studens = new Student[10]; (массив из 10 студентов)
        Методы:
            ● Стандартные (методы получения и установки, toString() и т. д.)
            ● public void addStudent(Student student) throws GroupOverflowException  (метод добавления
            студента в группу. В случае добавления 11 студента должно быть возбужденно пользовательское
            исключение)
            ● public Student searchStudentByLastName(String lastName) throws StudentNotFoundException
            (метод поиска студента в группе. Если студент не найден должно быть возбужденно пользовательское
            исключение)
            ● public boolean removeStudentByID(int id) (метод удаления студента по номеру зачетки, вернуть
            true если такой студент был и он был удален и false в противном случае)
                LESSON 4
        1) Дополните реализацию группы Студентов (задание прошлой лекции) возможностью сортировки
    массива студентов по фамилии. Для этого в класс Группа добавьте метод
    sortStudentsByLastName().
        2) Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры
    (имя, фамилии и т. д.). Создание и возврат студента на основе считанных данных. Используете
    методы этого класса для считывания и добавления студента в группу.

        1) Объявите интерфейс
    public interface StringConverter{
    public String toStringRepresentation (Student student);
    public Student fromStringRepresentation (String str); }
        2) Объявите класс CSVStringConverter реализующий указанный интерфейс. Логика реализации
    следующая — на основе Студента создать строку с его CSV представлением и наоборот на основе
    этой строки создать Студента. Ссылка на объяснение формата
    CSV https://en.wikipedia.org/wiki/Comma-separated_values .

                LESSON 5
        2) Реализуйте отдельный класс GroupFileStorage в котором будут следующие методы:
            ● void saveGroupToCSV(Group gr) — запись группы в CSV файл
            ● Group loadGroupFromCSV(File file) — вычитка и возврат группы из файла
            ● File findFileByGroupName(String groupName, File workFolder) — поиск файла в рабочем каталоге
    (workFolder). Название файла определяется названием группы в нем сохраненной.
 */

package oop.lection3.hwbaseadv;

import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student students[] = {
                new Student("Natalia", "O'Shay", Gender.woman, 111, "Some group"),
                new Student("Sergey", "Vishnyakov", Gender.man, 102, "Some group"),
                new Student("Dmitry", "Frolov", Gender.man, 103, "Some group"),
                new Student("Roman", "Bondar", Gender.man, 104, "Some group"),
                new Student("Ulii", "Teslar", Gender.man, 105, "Some group"),
                new Student("Dmitriy", "Dolya", Gender.man, 106, "Some group"),
                new Student("Svetlana", "Serdyk", Gender.woman, 107, "Some group"),
                new Student("Mariya", "Zeleznyak", Gender.woman, 108, "Some group"),
                new Student("Kuzma", "Kyzmenko", Gender.man, 109, "Some group"),
                new Student("Iren", "Adler", Gender.woman, 110, "Some group"),
        };

        Group someGroup = new Group();
        someGroup.setGroupName("Some group");

        try {
            someGroup.addStudent(students[0]);
            someGroup.addStudent(students[1]);
            someGroup.addStudent(students[2]);
            someGroup.addStudent(students[3]);
            someGroup.addStudent(students[4]);
            someGroup.addStudent(students[5]);
            someGroup.addStudent(students[6]);
            someGroup.addStudent(students[7]);
            someGroup.addStudent(students[8]);
            someGroup.addStudent(students[9]);

        } catch (GroupOverflowException e) {
            System.out.println(e.getMessage());
        }
//        System.err.println("Basic group");
//        System.out.println(someGroup);

//        System.out.print("Input the ID of the student that gonna be removed: ");
//        int id = sc.nextInt();
//        someGroup.removeStudentByID(id);
//        System.err.println("One student removed from the group");
//        System.out.println(someGroup);
//
//        AddNewStudent rc = new AddNewStudent();
//
//        System.out.println(rc.addStudentToGroup(rc.createStudentFromKeyboard(), someGroup));
//        System.err.println("One student added to the group");
//        System.out.println(someGroup);
//
//        someGroup.sortStudentsByLastName();
//        System.err.println("Group sorted by last name");
//        System.out.println(someGroup);
        //==========================================================
        //Saving to csv file and load from it

        GroupFileStorage groupStorage = new GroupFileStorage();
        groupStorage.saveGroupToCSV(someGroup);

        File fileForLoad = new File("Some group1.csv");
        Group gr = groupStorage.loadGroupFromCSV(fileForLoad);

        for (Student student1 : gr.getStudents()) {
            if (student1 != null) {
                System.out.println(student1);

            }
        }

        //==================================================
        //Equal students in group
        System.out.println(someGroup.CheckEqualStudentsInGroup());
    }
}
