package oop.lection9.hwbasetwo;

public interface StringConverter {
    public String toStringRepresentation (Student student);
    public Student fromStringRepresentation (String str);
}
//        try (PrintWriter pw = new PrintWriter(file)) {
//            for (int i = 0; i < student.length; i++) {
//                pw.println(student[i]);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }



