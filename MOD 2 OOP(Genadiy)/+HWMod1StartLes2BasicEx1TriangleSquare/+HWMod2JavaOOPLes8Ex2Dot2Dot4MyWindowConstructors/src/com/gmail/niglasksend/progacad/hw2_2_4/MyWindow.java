package com.gmail.niglasksend.progacad.hw2_2_4;

public class MyWindow {


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(double numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    private double width;
    private double height;
    private double numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height=height;
        this.numberOfGlass=numberOfGlass;
        this.color=color;
        this.isOpen=isOpen;
    }//конструктор без параметрів, який буде ініціалізувати поля класу деякими значеннями за замовчуванням

    public MyWindow() {
        this(0,0,0," ",true);

    }//конструктор без параметрів

    public MyWindow(double width, double height) {
        this(width,height,4,"red",true);

    }//перевантажений конструктор, який ініціалізує поля класу, залежно від параметрів:ширина, висота
    public MyWindow(double width, double height, int numberOfGlass) {
        this(width,height,numberOfGlass,"green",false);

    }//перевантажений конструктор, який ініціалізує поля класу, залежно від параметрів:ширина, висота, кількість скла

}
