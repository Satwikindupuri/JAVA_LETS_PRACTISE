import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(); // Read the number of test cases
        int sum=0,d;
        while(n>0){
            d=n%10; // Get the last digit
            sum+=d; // Add the last digit to the sum
            n=n/10; // Remove the last digit from n
        }
        System.out.println(sum); // Print the sum of digits
        scanner.close();
    }
}
