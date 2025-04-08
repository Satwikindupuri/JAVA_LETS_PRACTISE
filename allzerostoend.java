import java.util.Arrays;
import java.util.Scanner;

public class allzerostoend {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[j]!=0)
                    {
                        int tem=arr[i];
                        arr[i]=arr[j];
                        arr[j]=tem;
                        break;
                    }
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}