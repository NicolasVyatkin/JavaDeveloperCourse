public class Multiply {

}

//    public static com.gmail.niglasksend.progacad.hw2_2_1.Matrix multiply(com.gmail.niglasksend.progacad.hw2_2_1.Matrix p, com.gmail.niglasksend.progacad.hw2_2_1.Matrix q) throws Exception {
//
//
//        int p[][]=new int[n][m];
//        int q[][]=new int[m][k];
//        int Maze2[][]=new int[n][k];
//
//        for (int i = 0; i < n; i++) {
//            for (int u = 0; u < k; u++) {
//                for (int j = 0; j < m; j++) {
//
//
//                    Maze2[i][u] += p[i][j] * q[j][u];
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++)// Вывод третьей матрицы
//        {
//            for (int j = 0; j < k; j++) {
//                System.out.print(Maze2[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        return p;
//    }}

//
//    public static com.gmail.niglasksend.progacad.hw2_2_1.Matrix multiply(com.gmail.niglasksend.progacad.hw2_2_1.Matrix p, com.gmail.niglasksend.progacad.hw2_2_1.Matrix q) throws Exception {
//        int vert = p.getVerticalSize();
//        int horizon = q.getHorizontalSize();
//        int temp = p.getHorizontalSize();
//
//        if (temp != q.getVerticalSize()) //перевірка розміру матриць
//            System.out.println("Розмір матриць не відповідає");
//        com.gmail.niglasksend.progacad.hw2_2_1.Matrix result = new com.gmail.niglasksend.progacad.hw2_2_1.Matrix(vert, horizon);
//
//        for (int i = 0; i < vert; i++)
//            for (int j = 0; j < horizon; j++) {
//                int value = 0;
//                for (int k = 0; k < temp; k++) {
//                    value += p.getElement(i, k) * q.getElement(k, j);
//                }
//                result.setElement(i, j, value);
//            }
//        return result;
//    }






//    static int[][] multiplyMatrices(int[][] currentMatrix, int[][] paramMatrix) {
//        int[][] result = new int[currentMatrix.length][paramMatrix[0].length];
//
//        for (int row = 0; row < result.length; row++) {
//            for (int col = 0; col < result[row].length; col++) {
//                result[row][col] = multiplyMatricesCell(currentMatrix, paramMatrix, row, col);
//            }
//        }
//
//        return result;
//    }
//
//    static int multiplyMatricesCell(int[][] currentMatrix, int[][] paramMatrix, int row, int col) {
//        int cell = 0;
//        for (int i = 0; i < paramMatrix.length; i++) {
//            cell += currentMatrix[row][i] * paramMatrix[i][col];
//        }
//        return cell;
//    }

