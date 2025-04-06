import java.util.Scanner;
import java.util.Arrays;

public class RotateArraySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;

        // Create a new array to store rotated values
        int[] rotated = new int[n];

        // Put elements in their rotated position
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Rotated array: " + Arrays.toString(rotated));
    }
}
''