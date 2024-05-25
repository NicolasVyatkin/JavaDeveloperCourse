package com.gmail.niglasksend.progacad.hw2_2_2;

import java.util.Arrays;
public class Employee  {
    private String name;

    public Employee(String name) {

        this.name = name;
    }

    public void calcSalary(double... salary) {

        System.out.println(name + ": " + String.format("%.2f",Arrays.stream(salary).sum()) + " = " + Arrays.toString(salary));
    }

    public double getSomeSalary() {

        int minSalary = 5_200;
        int maxSalary = 47_000;

        return Math.random() * (maxSalary - minSalary) + minSalary;
    }

}
