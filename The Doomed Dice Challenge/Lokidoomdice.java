import java.util.Arrays;
public class Lokidoomdice 
{
    public static void main(String[] args) 
    {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        int[] result = undoom_dice(dieA, dieB);
        System.out.println("New Die A: " + Arrays.toString(Arrays.copyOfRange(result, 0, 6)));
        System.out.println("New Die B: " + Arrays.toString(Arrays.copyOfRange(result, 6, 12)));
    }
    public static int[] undoom_dice(int[] dieA, int[] dieB) 
    {
        int[] newDieA = new int[6];
        int[] newDieB = new int[6];
        for (int i = 0; i < 6; i++) 
        {
            newDieA[i] = Math.min(4, dieA[i]); 
        }
        int totalSpotsB = Arrays.stream(dieB).sum();
        double scaleFactor = (double) totalSpotsB / 15; 
        for (int i = 0; i < 6; i++) {
            newDieB[i] = (int) Math.round(dieB[i] / scaleFactor);
        }
        return A(newDieA, newDieB);
    }

    private static int[] A(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}