package com.gmail.niglasksend.progacad.hw2_2_1;

import java.util.Scanner;
/**
 * Class that resolves the 2.2.1 task
 *
 * @author Kolin Vyatkin
 * @version 1.0
 * 1. Створіть клас Matrix для квадратної матриці n-го порядку (розміром n х n) та елементами з цілими
 *      значеннями від 1 до 5, що задаються при створенні матриці випадково.
 * 2. Додайте до класу методи, що обчислюють суму та добуток двох матриць: поточної та матриці-параметра.
 * 3. Додайте до класу метод, що виводить на екран поточну матрицю.
 * 4. Напишіть клас з методом main, у якому створіть два об'єкти класу Matrix розміром 3 х 3 виведіть
 *      їх на екран, виконайте розрахунок їх суми та добутку та виведіть результати операцій на екран.
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the matrix size: ");
        Scanner sh = new Scanner(System.in);
        int size = sh.nextInt();

        Matrix curentMatrix = new Matrix(size);
        System.out.println("The current matrix size " + size+"x"+ size);
        curentMatrix.print();
        System.out.println();

        Matrix parameterMatrix = new Matrix(size);
        System.out.println("The parameter matrix size " + size+"x"+ size);
        parameterMatrix.print();
        System.out.println();

        System.out.println("Adding result: ");
        curentMatrix.matrixAdd(parameterMatrix).print();
        System.out.println();
        System.out.println("Multiplication result: ");
        curentMatrix.matrixMultiply(parameterMatrix).print();
    }
    }
//        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();// Количество строк первой матрицы
////        int m=sc.nextInt();
////        // Количество столбцов в первой матрице и количество строк во второй матрице
////        int k=sc.nextInt();// Количество столбцов во второй матрице
////        int[][] Maze =new int[n][m];
////        int[][] Maze1 =new int[m][k];
////        int[][] Maze2 =new int[n][k];
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix Maze1 = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix();
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix Maze2 = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix();
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix Maze3 = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix();
//
//        Maze1.BuildCurentMatrix();
//        Maze2.BuildCurentMatrix();
//        Maze3.multiply();

//        int[][] mA =
//                {{33,34,12},
//                        {33,19,10},
//                        {12,14,17},
//                        {84,24,51},
//                        {43,71,21}};
//
//        int[][] mB =
//                {{10,11,34,55},
//                        {33,45,17,81},
//                        {45,63,12,16}};
//
//
//        int m = mA.length;
//        int n = mB[0].length;
//        int o = mB.length;
//        int[][] res = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < o; k++) {
//                    res[i][j] += mA[i][k] * mB[k][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < res.length; i++) {
//            for (int j = 0; j < res[0].length; j++) {
//                System.out.format("%6d ", res[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}




//        for(int i=0;i<n;i++)// Вводим данные первой матрицы
//        {
//            for(int j=0;j<m;j++)
//            {
//                Maze[i][j]=sc.nextInt();
//
//            }
//        }
//        for(int i=0;i<m;i++)// Вводим данные второй матрицы
//        {
//            for(int j=0;j<k;j++)
//            {
//                Maze1[i][j]=sc.nextInt();
//
//            }
//        }

//        for(int i=0;i<n;i++)
//        {
//            for(int u=0;u<k;u++)
//            {
//                for(int j=0;j<m;j++)
//                {
//
//                    Maze2[i][u]+=Maze[i][j]*Maze1[j][u];
//                }
//            }
//        }
//
//        for(int i=0;i<n;i++)// Вывод третьей матрицы
//        {
//            for(int j=0;j<k;j++)
//            {
//                System.out.print(Maze2[i][j]+" ");
//
//            }
//            System.out.println();
//        }
//
//    }





//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Input array size: ");
//        n = sc.nextInt();
//
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix p = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix(n,n);
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix q = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix(n,n);
//
//        p.rndEl();
//        System.out.println("The current matrix: " + p);
//        q.rndEl();
//        System.out.println("The parameter-matrix: " +q);
//
//        try {
//            com.gmail.niglasksend.progacad.hw2_2_1.Matrix result = Multiply.multiply(p, q);
//            System.out.println("Multiply result: " + result);
//
//        } catch (Exception e) {
//            System.out.println("ERROR");
//        }
//    }


//        p.BuildCurentMatrix();
//        q.BuildCurentMatrix();
//        p.setElement(0,1,1);
//        p.setElement(0,2,1);
//
//        p.setElement(0,0,1);
//        p.setElement(1,1,1);
//        p.setElement(2,2,1);
//
//        q.setElement(0,0,1);
//        q.setElement(0,1,1);
//        q.setElement(0,2,1);



//
//
//        System.out.println("The current matrix: ");
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix.BuildCurentMatrix();
//        System.out.println("The parameter-matrix: ");
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix.BuildParamMatrix();
////        System.out.println(com.gmail.niglasksend.progacad.hw2_2_1.Matrix.multiplyByMatrix((com.gmail.niglasksend.progacad.hw2_2_1.Matrix.BuildCurentMatrix()), (com.gmail.niglasksend.progacad.hw2_2_1.Matrix.BuildParamMatrix())));

//    com.gmail.niglasksend.progacad.hw2_2_1.Matrix p = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix(3,3);
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix q = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix(3,3);
//
//        p.setElement(0,0,10);
//        p.setElement(0,1,10);
//        p.setElement(0,2,10);
//
//        p.setElement(1,0,10);
//        p.setElement(1,1,10);
//        p.setElement(1,2,10);
//
//        p.setElement(2,0,10);
//        p.setElement(2,1,10);
//        p.setElement(2,2,10);
//
//        q.setElement(0,0,10);
//        q.setElement(0,1,10);
//        q.setElement(0,2,10);
//
//        q.setElement(1,0,10);
//        q.setElement(1,1,10);
//        q.setElement(1,2,10);
//
//        q.setElement(2,0,10);
//        q.setElement(2,1,10);
//        q.setElement(2,2,10);
//
//        System.out.println("The current matrix: " + p);
//
//        System.out.println("The parameter-matrix: " +q);
