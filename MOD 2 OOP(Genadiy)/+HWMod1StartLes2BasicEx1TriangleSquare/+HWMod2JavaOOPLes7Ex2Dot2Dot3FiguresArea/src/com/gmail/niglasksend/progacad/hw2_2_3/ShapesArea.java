package com.gmail.niglasksend.progacad.hw2_2_3;

public class ShapesArea {

    public void calcSquare (double rad){
        System.out.println("Square of circle is: " + String.format("%.2f",Math.PI*rad*rad));

    }
    public void calcSquare (int a){
        System.out.println("Square area is: " + a*a);
    }
    public void calcSquare (int a, int b){
        System.out.println("Square of rectangle is: " + a*b);
    }

}
