package oop.lection3.hwbaseadv;

import java.io.*;
import java.util.Scanner;


public class GroupFileStorage {
    String del = ";";
    public GroupFileStorage() {

    }

    //запись группы в CSV файл
    void saveGroupToCSV(Group gr) {
        File groupName = new File(gr.getGroupName() + ".csv");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input divider for csv file: ");
        String del = sc.nextLine();

        try (PrintWriter pw = new PrintWriter(groupName)) {
            groupName.createNewFile();
            pw.println("Name" + del + "Soname" + del + "Gender" + del + "ID" + del + "Name of the group");
            for (int i = 0; i < gr.getStudents().length; i++) {
                Student student = gr.getStudents()[i];
                pw.println(student.getName() + del +
                        student.getLastName() + del +
                        student.getGenderType() + del +
                        student.getId() + del +
                        student.getGroupName());
            }
            System.out.println("File '" + gr.getGroupName() + ".csv' " + "created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //загрузка группы из CSV файла
    public Group loadGroupFromCSV(File file) {
        Group groupFromFile = new Group();
        groupFromFile.setGroupName("GroupTwo");
        String result = "";

        try (Scanner sc = new Scanner(file)) {
            for (; sc.hasNextLine(); ) {
                result += sc.nextLine() + System.lineSeparator();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] studentsLine = result.split(System.lineSeparator());
        System.err.println("Group successfully created from file " + file);

        for (int i = 0; i < studentsLine.length; i++) {

            String student = studentsLine[i];
            String[] s = student.split(this.del);
            String name = s[0];
            String lastName = s[1];

            Gender gender;
            if (s[2].equals(Gender.man)) {
                gender = Gender.man;
            } else {
                gender = Gender.woman;
            }

            int id = Integer.parseInt(s[3]);
            String groupName = s[4];

            try {
                Student studentFromFile = new Student(name, lastName, gender, id, groupName);
                groupFromFile.addStudent(studentFromFile);

            } catch (GroupOverflowException e) {
                e.printStackTrace();
            }
        }

        groupFromFile.getStudents();
        return groupFromFile;
    }

    //поиск файла в рабочем каталоге
    //(workFolder). Название файла определяется названием группы в нем сохраненной.
    public File findFileByGroupName(String groupName, File workFolder) throws IOException {
        File[] files = workFolder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].getName().startsWith(groupName)) {
                System.out.println(files[i]);
                return files[i];
            }
        }
        return null;
    }


}

//    File findFileByGroupName(String groupName, File workFolder) {
//        return workFolder;
//    }

//сохранение группы в csv файл

//    public void saveGroupToCSV(Group grp) {
//        List<Student> student = grp.getStudentList();
//        Collections.sort(student, Comparator.nullsFirst(new StudentNameComparator()));
//        File file = new File(grp.getName() + ".csv");
//        try (PrintWriter pr = new PrintWriter(file)) {
//            for (Student st : student) {
//                pr.print(st.toCSVString() + System.lineSeparator());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

//вычитка и возврат группы из файла
//    public static Group loadGroupFromCSV(File file) {
//        Group loadedGroup = new Group();
//        try (Scanner sc = new Scanner(file)) {
//            for (; sc.hasNextLine(); ) {
//
////                loadedGroup = loadedGroup + sc.nextLine() + System.lineSeparator();
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return loadedGroup;
//    }
//
//    //создание студента из scv строки
//    public  String toStringRepresentation(Student student){
//        String studentToStringReprasentation = student.getName()+","+student.getLastName()+
//                ","+student.getGenderType()+","+student.getId()+","+
//                student.getGroupName();
//        return studentToStringReprasentation;
//    }
//
//
//    //вычитка и возврат группы из файла
//    public Group loadGroupFromCSV(File file) {
//        String[] grName;
//        Group grp = null;
//        Student student = null;
//        if (file != null) {
//            grName = file.getName().split("\\.");
//            grp = new Group(grName[0]);
//            student = new Student();
//        }
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String text = "";
//            for (; (text = br.readLine()) != null;) {
//                try {
//                    grp.addStudents(student.fromCSVString(text));
//                } catch (NumberStudentsIndexOutBoundExecption e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        return grp;
//    }
//    //поиск файла в рабочем каталоге
//    //(workFolder). Название файла определяется названием группы в нем сохраненной.
//
//    public File findFileByGroupName(String groupName, File workFolder) {
//        File[] files = workFolder.listFiles();
//        for (File file : files) {
//            if (file.getName().equals(groupName + ".csv")) {
//                return file;
//            }
//        }
//        return null;
//    }
