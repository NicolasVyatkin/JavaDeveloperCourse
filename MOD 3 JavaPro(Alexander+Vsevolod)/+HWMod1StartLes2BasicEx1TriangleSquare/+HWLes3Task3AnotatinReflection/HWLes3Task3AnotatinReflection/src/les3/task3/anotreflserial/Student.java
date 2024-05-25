package les3.task3.anotreflserial;

import java.io.Serializable;

public class Student implements Serializable {

    @Save
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
