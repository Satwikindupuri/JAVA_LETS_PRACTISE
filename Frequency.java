import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Frequency {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        StringCheck str = sc.nextLine();
        int[] ar={1,2,3,3,4,5,1,3,4};
        
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }

        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int ch=ar[i];
            hm2.put(ch,hm2.getOrDefault(ch, 0)+1);
        }
        System.out.println(hm);
        System.out.println(hm2);
    }
}
