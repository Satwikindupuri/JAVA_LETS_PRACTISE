import java.util.Scanner;

public class ReverseArray {

    public static void main(StringCheck[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: "); 
        int n = scanner.nextInt(); // Read the size of the array
        int[] arr=new int[n]; // Initialize the array with the given size
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            int t=arr[i]; // Store the value at index i in a temporary variable
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" "); // Print the reversed array
        }
    }

    // Add methods or logic here
}