public class SumPossibleCombinations
{
    public static void main(String[] args) 
    {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};
        int[][] matrix = Matrix(Die_A, Die_B);
        int totalcombinations = combinations(Die_A.length, Die_B.length);

        double[] b = probabilities(matrix, totalcombinations);
        print(b);
    }
    private static int[][] Matrix(int[] Die_A, int[] Die_B) {
        int[][] arr=new int[Die_A.length][Die_B.length];

        for (int i = 0; i < Die_A.length; i++) {
            for (int j = 0; j < Die_B.length; j++) {
                arr[i][j] = Die_A[i] + Die_B[j];
            }
        }

        return arr;
    }

    private static int combinations(int x, int y) {
        return x * y;
    }

    private static double[] probabilities(int[][] Matrix, int combinations) {
        double[] b = new double[2 * Matrix.length - 1];

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                b[Matrix[i][j] - 2] += 1.0 / combinations;
            }
        }

        return b;
    }

    private static void print(double[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.printf("P(Sum = %d) = %.4f%n", i + 2, b[i]);
        }
    }

}