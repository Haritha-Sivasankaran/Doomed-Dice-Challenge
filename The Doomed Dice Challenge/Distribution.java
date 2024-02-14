import java.util.Arrays;
public class Distribution 
{
    public static void main(String[] args) {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        int[][] matrix = Matrix(Die_A, Die_B);
        print(matrix);
    }

    private static int[][] Matrix(int[] Die_A, int[] Die_B) {
        int[][] arr = new int[Die_A.length][Die_B.length];

        for (int i = 0; i < Die_A.length; i++) {
            for (int j = 0; j < Die_B.length; j++) {
                arr[i][j] = Die_A[i] + Die_B[j];
            }
        }

        return arr;
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
