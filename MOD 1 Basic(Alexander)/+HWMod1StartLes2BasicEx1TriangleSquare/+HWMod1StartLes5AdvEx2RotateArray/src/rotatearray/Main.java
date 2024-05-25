package rotatearray;

/**
 *«Перевернуть массив». Т.е. написать программу которая повернет заданный массив на 90,180,270
 * градусов по часовой стрелке. (При выполнении задания использовать дополнительный массив
 * нельзя). В примере показан поворот на 90 градусов:
 * [1, 5, 1, 2, 4, 4, 1, 7]      [6, 9, 7, 2, 2, 8, 5, 1]
 * [5, 1, 1, 4, 6, 9, 1, 3]      [3, 0, 1, 1, 6, 8, 1, 5]
 * [8, 8, 4, 1, 9, 2, 3, 3]      [7, 2, 4, 5, 8, 4, 1, 1]
 * [2, 6, 8, 7, 6, 0, 6, 9] ===> [7, 4, 9, 4, 7, 1, 4, 2]
 * [2, 1, 5, 4, 0, 5, 6, 3]      [9, 9, 6, 0, 6, 9, 6, 4]
 * [7, 1, 4, 9, 6, 3, 8, 9]      [3, 7, 3, 5, 0, 2, 9, 4]
 * [9, 0, 2, 4, 9, 7, 4, 6]      [8, 4, 8, 6, 6, 3, 1, 1]
 * [6, 3, 7, 7, 9, 3, 8, 9]      [9, 6, 9, 3, 9, 3, 3, 7]
 *
 * */

public class Main {
    public static void main(String[] args) {
        int[][] massA = createMatrix();
        int[][] massB=turn(massA);//  for 90 degree rotation*
        int[][] massС=turn(turn(massA));// for 180 degree rotation*
        int[][] massD=turn(turn(turn(massA)));// for 270 degree rotation*
        System.out.println("Basic matrix: ");
        printMatrix(massA);
        System.out.println("");
        System.out.println("Rotated matrix: ");
        printMatrix(massB);
        //printMatrix(massC);
        //printMatrix(massD);
    }

    public static int[][] createMatrix() {
        int[][] massA=new int[6][6];
        for (int i = 0; i <massA.length ; i++) {
            for (int j = 0; j <massA.length ; j++) {
                massA[i][j]=j+1;
            }
        }
        return massA;
    }

    public static void printMatrix(int[][] mass) {
        for (int[] ints : mass) {
            for (int x : ints
            ) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static int[][] turn(int[][] massA) {
        int[][] result=new int[massA.length][massA.length];
        for (int i = 0; i <massA.length ; i++) {
            for (int j = 0; j <massA.length ; j++) {
                result[i][j]=massA[massA.length-1-j][i];
            }

        }
        return result;
    }
}