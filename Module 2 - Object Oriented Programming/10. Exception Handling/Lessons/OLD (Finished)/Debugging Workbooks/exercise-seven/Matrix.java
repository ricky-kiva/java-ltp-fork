import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { //matrix means 2d array
             {0, 0, 0},
             {0, 0, 0},
             {0, 0, 0}
        };

        for (int i = 0; i <= (matrix.length-1); i++) {
            for (int j = 0; j <= (matrix[i].length-1); j++) {
                matrix[j][i] = i;
            }
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
