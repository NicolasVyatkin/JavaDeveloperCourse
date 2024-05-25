package com.gmail.niglasksend.progacademy.lesson8hw2_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.addAll;

public class List {
    private final java.util.List<Student> studentList;
    private final java.util.List<String> subjectList;
    private final HashMap <String, HashMap<String, Integer>> map;

    public List(final String[] subjectList) {
        this.subjectList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        addAll(this.subjectList, subjectList);

        this.map = new HashMap<>();
        for (final String subject : subjectList) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addStudent(final Student student) {
        studentList.add(student);
    }

    public void addSubject(final String subject) {
        subjectList.add(subject);
    }

    public void infoAboutStudents() {
        for(final Student student: studentList) {
            System.out.print("id " + student.getId() + " Name - "+ student.getName()+"  Course - " +student.getCourse()+ ", isMale - " +student.isMale()+ ", Age - " +student.getAge() + "  ");

            subjectList.stream().map((subject) -> (subject) + " - " + getMark(subject, student.getId()) + "  ").forEach(System.out::print);
            System.out.println();
        }
    }

    public void setMark(final String id, final String subject, final int mark) {
        final HashMap<String, Integer> m = map.computeIfAbsent(subject, k -> new HashMap<>());
        m.put(id, mark);
    }

    public int getMark(final String subject, final String id) {
        final HashMap<String, Integer> m = map.computeIfAbsent(subject, k -> new HashMap<>());
        final Integer mark = m.get(id);
        if (mark == null) {
            return 0;
        }
        return mark;
    }

    private int getSumMarks(final String id) {
        int sum = 0;

        for (final String subject : subjectList) {
            sum += getMark(subject, id);
        }
        return sum;
    }

    public String getHighestAverage() {
        Student highestScores = null;
        int max=0;
        int sum;
        for (final Student student : studentList) {
            sum = getSumMarks(student.getId());
            if (sum > max) {
                max = sum;
                highestScores = student;
            }
        }
        assert highestScores != null;
        return highestScores.getId();
    }

    public void getHighestAverageScore() {
        final String highestScoreId = getHighestAverage();
        System.out.print("id " + highestScoreId + " - ");

        subjectList.stream().map((subject) -> (subject) + " - " + getMark(subject, highestScoreId) + " ").forEach(System.out::print);
        System.out.println();
    }

    public Map<String, Integer> getGrades(final String subject) {
        return map.get(subject);
    }

}
