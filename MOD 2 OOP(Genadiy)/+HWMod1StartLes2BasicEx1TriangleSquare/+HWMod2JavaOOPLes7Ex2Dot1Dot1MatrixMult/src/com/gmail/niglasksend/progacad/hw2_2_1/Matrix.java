package com.gmail.niglasksend.progacad.hw2_2_1;

import java.util.Arrays;

public class Matrix {

    private int[][] matrix;

    public Matrix(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (int) (Math.random() * 5 + 1);
            }
        }
        this.matrix = array;
    }

    public Matrix(int[][] matrix) {

        this.matrix = matrix;
    }

    public Matrix() {
    }

    public void print() {

        for (int[] arr : matrix) {

            System.out.println(Arrays.toString(arr));
        }
    }

    public Matrix matrixAdd(Matrix matrix) {

        int n = this.matrix.length;
        int[][] matrixSum = new int[n][n];
        int[][] paramMatrix = matrix.getMatrix();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrixSum[i][j] = this.matrix[i][j] + paramMatrix[i][j];
            }
        }
        return new Matrix(matrixSum);
    }

    public Matrix matrixMultiply(Matrix matrix) {

        int n = this.matrix.length;
        int[][] matrixSum = new int[n][n];
        int[][] paramMatrix = matrix.getMatrix();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {

                    matrixSum[i][j] += this.matrix[i][k] * paramMatrix[k][j];
                }
            }
        }
        return new Matrix(matrixSum);
    }

    public int[][] getMatrix() {

        return matrix;
    }
}
//    public int length;
//
//    public static int[][] BuildCurentMatrix() {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Input array size: ");
//        n = sc.nextInt();
//        int[][] currentMatrix = new int[n][n];
//        for (int i = 0; i < currentMatrix.length; i++) {
//            for (int j = 0; j < currentMatrix[i].length; j++) {
//                currentMatrix[i][j] = ((int) (Math.random() * 5 + 1));
//            }
//        }
//        for (int[] row :
//                currentMatrix) {
//            System.out.println(Arrays.toString(row));
//        }
//        return new int[][]{};
//
//    }}


//    public static com.gmail.niglasksend.progacad.hw2_2_1.Matrix multiply(com.gmail.niglasksend.progacad.hw2_2_1.Matrix[][] p, com.gmail.niglasksend.progacad.hw2_2_1.Matrix[][] q) throws Exception {
//
//        int m = p.length;
//        int n = q[0].length;
//        int o = q.length;
//        int[][] res = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < o; k++) {
//                    res[i][j] += p[i][k] * q[k][j];
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
//        return null;
//    }}
//


//    private static int[][] a;
//    public com.gmail.niglasksend.progacad.hw2_2_1.Matrix(int n, int m) {
//        a = new int[n][m];
//    }
//    public int getVerticalSize() {
//        return a.length;
//    }
//    public int getHorizontalSize() {
//        return a[0].length;
//    }
//    public int getElement(int i, int j) {
//        return a[i][j];
//    }
//    public void setElement(int i, int j, int value) {
//        a[i][j] = value;
//    }
//    public String toString() {
//        StringBuilder s = new StringBuilder("\nMatrix : " + a.length + "x" + a[0].length + "\n");
//        for (int[] vector : a) {
//            for (int value : vector)
//                s.append(value).append(" ");
//            s.append("\n");
//
//        }
//        return s.toString();
//    }
//    public void rndEl() {
//        for (int i = 0; i < getVerticalSize(); i++) {
//            for (int j = 0; j < getHorizontalSize(); j++) {
//                int value = 0;
//                value = (int) (Math.random() * 5 + 1);
//                setElement(i, j, value);
//            }
//        }
//    }


//    public static int[][] currentMatrix;
//    public static int[][] paramMatrix;
//    public static int[][] expectedMatrix;
//

//    }
//
//    public static int[][] BuildParamMatrix() {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Input array size: ");
//        n = sc.nextInt();
//        int[][] paramMatrix = new int[n][n];
//        for (int i = 0; i < paramMatrix.length; i++) {
//            for (int j = 0; j < paramMatrix[i].length; j++) {
//                paramMatrix[i][j] = ((int) (Math.random() * 5 + 1));
//            }
//        }
//        for (int[] row :
//                paramMatrix) {
//            System.out.println(Arrays.toString(row));
//        }
//        return new int[][]{};
//    }



