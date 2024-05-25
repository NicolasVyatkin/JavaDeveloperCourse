package com.gmail.niglasksend.progacad.hw2_2_4;

import java.util.ArrayList;
import java.util.HashMap;

public class List {
    private final java.util.List<MyWindow> myWindowList;
    private final HashMap<String, HashMap<String, Integer>> map;

    public List(final String[] subjectList) {
        this.myWindowList = new ArrayList<>();

        this.map = new HashMap<>();
        for (final String subject : subjectList) {
            this.map.put(subject, new HashMap<>());
        }
    }
    public void addWindow(final MyWindow myWindow) {
        myWindowList.add(myWindow);
    }

    public void printFields() {
        for (final MyWindow myWindow : myWindowList) {
            System.out.print(("Window width - " + myWindow.getWidth() + ", window height - " + myWindow.getHeight()
                    + ", window glass number - " + myWindow.getNumberOfGlass() + ", window color - "
                    + myWindow.getColor() + ", is window open - " + myWindow.isOpen()));

            System.out.println();
        }
    }
}