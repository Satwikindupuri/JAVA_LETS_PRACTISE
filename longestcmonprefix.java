import java.util.Scanner;

public class longestcmonprefix {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the number of strings: ");
        StringCheck s1=sc.next();
        StringCheck s2=sc.next();
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.print(s1.charAt(i));
                    break;
                }
            }
        }

    }
}
