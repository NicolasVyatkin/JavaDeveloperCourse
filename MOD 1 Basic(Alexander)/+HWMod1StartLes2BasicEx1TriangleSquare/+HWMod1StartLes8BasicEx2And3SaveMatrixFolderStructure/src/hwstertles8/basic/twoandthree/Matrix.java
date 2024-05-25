package hwstertles8.basic.twoandthree;


import java.util.Arrays;

//Создание рандомной матрици
public class Matrix {

    private int[][] matrix;

    public Matrix(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = (int) (Math.random() * 25 * Math.random());
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
    //Перевод двумерного массива в строчную форму
    public String twoLevelArrayToString(){
        StringBuilder sb = new StringBuilder();
        for(int[] rows : matrix){
            for (int col:rows){
                sb.append(String.format("%-6.6s\t",""+col));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }


    }
