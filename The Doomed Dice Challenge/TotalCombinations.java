public class TotalCombinations 
{
    public static void main(String[] args) {
        int[] Die_A = {1, 2, 3, 4, 5, 6};
        int[] Die_B = {1, 2, 3, 4, 5, 6};

        int a = combinations(Die_A.length, Die_B.length);
        System.out.println("Total Combinations: " + a);
    }

    private static int combinations(int x, int y) {
        return x * y;
    }
}
