import java.util.*;

public class reverseString {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringCheck s=sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}