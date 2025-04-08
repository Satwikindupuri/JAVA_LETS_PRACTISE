import java.util.*;

public class basic {
    public static void main(StringCheck[] args) {
        int[] arr={1,2,3,4,5};
        int copy[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            copy[j++]=arr[i];
        }
        System.out.println("Reversed"+Arrays.toString(copy));
        
    }
}
