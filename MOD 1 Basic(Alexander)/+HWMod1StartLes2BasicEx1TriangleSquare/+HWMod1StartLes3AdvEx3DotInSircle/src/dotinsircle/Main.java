package dotinsircle;

import java.util.Scanner;

/**
 *3) Есть круг с центром в начале координат и радиусом 4. Пользователь вводит с клавиатуры
 * координаты точки x и y (вещественные числа). Написать программу которая определит лежит ли
 * эта точка внутри круга или нет. Подробнее в этом видео - https://youtu.be/SlmWORzlpDc
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the coordinates of the dot");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        double basicSqare = Math.PI*4*4;
        double userSquare = Math.PI*Math.abs(x*x+y*y);
        if (userSquare<basicSqare&&x<4&&y<4){
            System.out.println("Your dot is inside the basic circle");
        } else if (userSquare==basicSqare&&x==4&&y==4) {
            System.out.println("Your dot is on the age of the basic circle");

        }else {
            System.out.println("Your dot is out of bounds of the basic circle");
        }
    }
}