package les3.task3.anotreflserial;

import java.io.InvalidObjectException;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Kolin");
        for(Field field:student.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Save.class)){
                Serializator serializator = new Serializator();
                System.out.println(serializator.Serialization(student));
                try {
                    Student student1 = serializator.DeSerialization();
                    System.out.println(student1.getName());
                } catch (InvalidObjectException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("There is no annotated fields");
            }
        }




    }
}