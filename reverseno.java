import java.util.List;
import java.util.Scanner;

public class reverseno {
    public static void main(StringCheck[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list = new java.util.ArrayList<>();
        while(n>0){
            int d=n%10;
            list.add(d);
            n=n/10;
        }
        for(int x:list){
            System.out.print(x);
        }
    }
}
