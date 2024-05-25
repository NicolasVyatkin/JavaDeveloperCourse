package oop.lection9.hwbasetwo;

import java.io.*;
import java.util.List;
import java.util.Scanner;


public class GroupFileStorage {
    // save group to CSV file
    public void saveGroupToCSV(Group gr) {
        String fileName = gr.getGroupName();
        File fileCSV = new File(fileName + ".csv");
        List<Student> students = gr.getStudents();
        CSVStringConverter studentToString = new CSVStringConverter();
        String CSVString = "";
        for (Student student : students) {
            CSVString = CSVString + studentToString.toStringRepresentation(student) + System.lineSeparator();
        }

        try (PrintWriter pw = new PrintWriter(fileCSV)){
            pw.println(CSVString);
            System.out.println("File '" + gr.getGroupName() + ".csv' " + "created successfully");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // load group from file
    public Group loadGroupFromCSV(File file) {

        Group gr = new Group();
        String fileFullName = file.getName();
        String[] fileName = fileFullName.split("[;]");
        gr.setGroupName(fileName[0]);
        gr.setPlaces(10);

        Student student = new Student();
        CSVStringConverter studentFromCSV = new CSVStringConverter();
        try (Scanner sc = new Scanner(file)){
            for (; sc.hasNextLine(); ) {
                String studentText = sc.nextLine();
                if (!studentText.equals("")) {
                    student = studentFromCSV.fromStringRepresentation(studentText);
                        gr.addStudent(student);
                }
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        return gr;
    }

    // find file in workFolder
    public File findFileByGroupName(String groupName, File workFolder) {
        File[] fileInFolder = workFolder.listFiles();
        File foundFile = new File("");
        for (int i = 0; i < fileInFolder.length; i++) {
            if(fileInFolder[i].getName().toLowerCase().startsWith(groupName.toLowerCase())) {
                foundFile =  fileInFolder[i];
            }
        }
        return foundFile;
    }
}
