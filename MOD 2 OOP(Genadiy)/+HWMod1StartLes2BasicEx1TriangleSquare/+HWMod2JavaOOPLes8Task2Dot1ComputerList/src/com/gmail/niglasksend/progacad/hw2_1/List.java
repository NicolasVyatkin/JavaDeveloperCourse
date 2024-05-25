package com.gmail.niglasksend.progacad.hw2_1;
/**
 * Class that woks with array
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class List {
    private final java.util.List<Computer> computerList;
    private final HashMap<String, HashMap<String, Integer>> map;

    public List(final String[] subjectList) {
        this.computerList = new ArrayList<>();

        this.map = new HashMap<>();
        for (final String subject : subjectList) {
            this.map.put(subject, new HashMap<>());
        }
    }

    public void addComputer(final Computer computer) {
        computerList.add(computer);
    }

    public void view() {
        for (final Computer computer : computerList) {
            System.out.print(("Trade mark -  " + computer.getMark() + ", Serial number - №" + computer.getSerialNumber() + ", Prise - " + computer.getPrice() + " UAH" + ", CPU quantity - " + computer.getQuantityCPU() + " pc." + ", CPU frequency - " + computer.getFrequencyCPU() + " GHz"));

            System.out.println();
        }
    }

    public void viewNewPrice() {
        for (final Computer computer : computerList) {
            System.out.print("Input the percent of price increase for " + computer.getMark() + ": ");
            Scanner sc = new Scanner(System.in);
            double multiInd;
            multiInd = sc.nextDouble() / 100;

            System.out.print(("Trade mark -  " + computer.getMark() + ", Serial number - №" + computer.getSerialNumber() + ", Prise - " + String.format("%.2f", computer.getPrice() + computer.getPrice() * multiInd) + " UAH" + ", CPU quantity - " + computer.getQuantityCPU() + " pc." + ", CPU frequency - " + computer.getFrequencyCPU() + " GHz"));

            System.out.println();
        }
    }
}
