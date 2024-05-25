package com.gmail.niglasksend.progacad.hw2_2_2;

import java.util.Scanner;
/**
 * Class that resolves the 2.2.2. task
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Напишіть клас Employee з полем name (String) та відповідним конструктором.
 * 2. Додайте до класу Employee метод calcSalary з varargs-аргументом salary (double).
 *      Цей метод повинен обчислити загальну зарплату працівника та вивести на екран його ім’я та загальну зарплату.
 * 3. Напишіть клас Accountant, який буде створювати екземпляр Employee і використовуватиме його метод із
 *      різною кількістю даних.
 */

public class Accountant {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Kolin");
        System.out.print("Enter the amount of monses for iteration: ");
        Scanner sh = new Scanner(System.in);
        int it = sh.nextInt();

        for (int i = 0; i < it; i++) {

            double[] salaries = new double[i + 1];

            for (int j = 0; j <= i; j++) {

                salaries[j] = employee1.getSomeSalary();
            }
            employee1.calcSalary(salaries);
        }
    }

//    private final java.util.List<com.gmail.niglasksend.progacad.hw2_2_2.Employee > computerList;
//    private final HashMap<String, HashMap<String, Integer>> map;
//
//    public com.gmail.niglasksend.progacad.hw2_2_2.Accountant(final String[] subjectList) {
//        this.computerList = new ArrayList<>();
//
//        this.map = new HashMap<>();
//        for (final String subject : subjectList) {
//            this.map.put(subject, new HashMap<>());
//        }
//    }
//
//    public void addEmployee(final com.gmail.niglasksend.progacad.hw2_2_2.Employee  employee) {
//        computerList.add(com.gmail.niglasksend.progacad.hw2_2_2.Employee);
//    }
//
//    public void view() {
//        for (final com.gmail.niglasksend.progacad.hw2_2_2.Employee  employee  : computerList) {
//            System.out.print(("Name -  " + employee.getName() + ", Salary" + employee.getSalary() + " UAH"));
//
//            System.out.println();
//        }
//    }
//
//    public void viewNewPrice() {
//        for (final com.gmail.niglasksend.progacad.hw2_2_2.Employee  computer : computerList) {
//            System.out.print("Input the percent of price increase for " + computer.getMark() + ": ");
//            Scanner sc = new Scanner(System.in);
//            double multiInd;
//            multiInd = sc.nextDouble() / 100;
//
//            System.out.print(("Trade mark -  " + computer.getMark() + ", Serial number - №" + computer.getSerialNumber() + ", Prise - " + String.format("%.2f", computer.getPrice() + computer.getPrice() * multiInd) + " UAH" + ", CPU quantity - " + computer.getQuantityCPU() + " pc." + ", CPU frequency - " + computer.getFrequencyCPU() + " GHz"));
//
//            System.out.println();
//        }
//    }
}