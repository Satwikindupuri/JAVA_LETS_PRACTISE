/*
You are given a list of marks scored by n students in a test. 
Your task is to:
Read the marks of all students into an array.
Find and display the:

Highest score

Lowest score

Average score (rounded to 2 decimal places)

Sort the array in ascending order.

Check if a given score x exists in the array or not.

Create a copy of the original array and reverse it.

Print the top 3 scores.
*/


import java.util.Arrays;
import java.util.Scanner;


public class Arrays1 {
    public static void main(StringCheck[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int target=sc.nextInt();

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("highest"+Arrays.stream(arr).max().getAsInt());
    System.out.print("lowest"+Arrays.stream(arr).min().getAsInt());
    
    int sum=0;
    for(int j=0;j<n;j++){
        sum+=arr[j];
    }
    System.out.println();
    double avg=(double)sum/n;
    System.out.printf("%.2f",avg);
    
    System.out.println();
    //System.out.println("Before Sorting"+Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println("Sorted"+Arrays.toString(arr));
    
    for(int i=0;i<n;i++)
    {
        if(arr[i]==target)
        {
            System.out.println("Found At"+i);
            break;
        }
    }
    int [] copy=Arrays.copyOf(arr,n);
    Arrays.sort(copy);
    int j=0;
    for(int i=n-1;i>=0;i--)
    {
        copy[j++]=arr[i];
    }
    System.out.println("Reversed" +Arrays.toString(copy));
    for(int i=0;i<3;i++)
    {
        System.out.print(copy[i]);
    }
}
}

