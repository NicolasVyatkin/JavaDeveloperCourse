package dotintriangle;

import java.util.Scanner;

/**
 *4) Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь вводит с клавиатуры
 * координаты точки x и y (вещественные числа). Написать программу которая определит лежит ли
 * эта точка внутри треугольника или нет. Подробнее в этом видео - https://youtu.be/RIFXebcuryc
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the coordinates of the dot");
        System.out.print("x: ");
        int x =sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        if(x<=5&&y==1&&x>=0||x<=5&&y==2&&x>=0||y==3&&x==4){
            System.out.println("Dot located inside the basic triangle");
        } else if (x==0&&y==0||x==6&&y==1||x==4&&y==4) {
            System.out.println("This is the apex the triangle");

        }else System.out.println("Your dot is out of the basic triangle");

//        System.out.println("Введите координаты Х: ");
//        double x = sc.nextDouble();
//        System.out.println("Введите координаты Y: ");
//        double y = sc.nextDouble();
//        if((((x-0)*(y-4)-(y-0)*(0-4)>=0)&&((x-0)*(4-1)-(y-4)*(0-6)>=0))&&((x-6)*(1-4)-(y-1)*(6-0)>=0)) {
//            System.out.println("Лежит");
//        }
//        else System.out.println("Не лежит");
    }
}