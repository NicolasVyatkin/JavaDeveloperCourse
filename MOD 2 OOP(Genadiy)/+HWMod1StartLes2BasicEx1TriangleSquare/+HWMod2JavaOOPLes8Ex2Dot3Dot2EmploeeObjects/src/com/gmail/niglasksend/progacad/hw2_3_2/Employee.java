package com.gmail.niglasksend.progacad.hw2_3_2;

public class Employee {

    public String firstName;
    public String lastName;
    public String occupation;
    public String phone;
    static int numberOfEmployees;

    public Employee(String firstName,String lastName,String occupation,String phone){
        numberOfEmployees++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation =occupation;
        this.phone=phone;
    }
    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "com.gmail.niglasksend.progacad.hw2_3_2.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

//    {
//        numberOfEmployees++;
//    }
