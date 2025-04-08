import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class contains {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); // Corrected List declaration
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt(); 
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        
        // Corrected the contains check
        if (list.contains(target)) {
            System.out.println("The array contains the target value.");
        } else {
            System.out.println("The array does not contain the target value.");
        }
    }
}
