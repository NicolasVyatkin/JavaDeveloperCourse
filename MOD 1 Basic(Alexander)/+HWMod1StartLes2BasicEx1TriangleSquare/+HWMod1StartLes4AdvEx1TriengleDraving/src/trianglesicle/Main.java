package trianglesicle;

import java.util.Scanner;

/**
 * 1) С помощью цикла (только одного) нарисовать фигуру изображенную ниже. Максимальная высота
 * этой фигуры вводится с клавиатуры (в примере максимальная высота — 4.).
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter maximum height of the triangle: ");
        int height = sc.nextInt();
        int iter = 1;

        for (int i = 1; i <= height; ++i) {
            System.out.print("*");
            if (iter <= i && iter < height) {
                System.out.println();
                iter++;
                i = 0;
            }
            if (height == i) {
                System.out.println();
                height--;
                i = 0;
            }
        }


//        for ( int i = n; i >= 1; i--) {
//            for ( int j  = n; j  >= i; j --) {
//                System. out.print( "*" );
//            }
//            System. out.println();
//        }
//
//        for ( int i = 1; i <= n; i++) {
//            for ( int j  = i; j  <= n; j ++) {
//                System. out.print( "*" );
//            }
//            System. out.println();
//        }

//

    }
}

