package com.gmail.niglasksend.progacademy.lesson8hw2_1;

public class Student {
    private String id;//long
    private String name;
    private int course;
    private boolean isMale;
    private int age;

    public Student(final String id,final String name, final int course, final boolean isMale, final int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.isMale = isMale;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(final boolean male) {
        isMale = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course=" + course +
                ", isMale=" + isMale +
                ", age=" + age +
                '}';
    }
}