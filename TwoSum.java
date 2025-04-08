import java.util.Scanner;

public class TwoSum {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false; // To track if a pair is found
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " " + arr[j]);
                    found = true;
                    break; // Exit the inner loop
                }
            }
            if (found) {
                break; // Exit the outer loop if a pair is found
            }
        }

        if (!found) {
            System.out.println("No pair found that sums to the target.");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
