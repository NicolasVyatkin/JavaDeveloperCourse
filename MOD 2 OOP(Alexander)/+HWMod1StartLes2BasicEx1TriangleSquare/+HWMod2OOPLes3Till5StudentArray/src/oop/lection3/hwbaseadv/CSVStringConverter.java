package oop.lection3.hwbaseadv;

public class CSVStringConverter implements StringConverter{
    public CSVStringConverter() {
    }

    @Override
    public String toStringRepresentation(Student student) {
        String toCSV = student.getName() + ";" + student.getLastName() + ";" + student.getGenderType() + ";" + student.getId()+ ";" + student.getGroupName();
        return toCSV;
    }

    @Override
    public Student fromStringRepresentation(String str) {
        String [] strMass = str.split(";"); // creates a massive from string

        return new Student(strMass[0],strMass[1],Gender.valueOf(strMass[2]),Integer.valueOf(strMass[3]),strMass[4]);
    }
}


