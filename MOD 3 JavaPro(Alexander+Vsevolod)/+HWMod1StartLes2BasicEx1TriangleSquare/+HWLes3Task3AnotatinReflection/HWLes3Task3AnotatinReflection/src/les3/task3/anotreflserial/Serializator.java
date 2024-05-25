package les3.task3.anotreflserial;

import java.io.*;

public class Serializator {

    //Method that serialize to file
    public boolean Serialization(Student student) {
        boolean flag = false;
        File file = new File("./student.csv");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(student);
                flag = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

    }
        return flag;
    }
//Method that deserialize from file

    public Student DeSerialization() throws InvalidObjectException {
        File file = new File("./student.csv");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Student student = (Student) ois.readObject();
                return student;

            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }

        throw new InvalidObjectException("There is no such object");
    }

}
