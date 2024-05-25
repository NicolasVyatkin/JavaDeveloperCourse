package oop.lection9.hwbasetwo;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    private Gender genderType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender gender) {
        genderType = gender;
    }

    public Human(String name, String lastName, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.genderType = gender;
    }

    public Human() {
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", genderType=" + genderType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && genderType == human.genderType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, genderType);
    }
}
