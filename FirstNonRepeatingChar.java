import java.util.HashMap;
import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(StringCheck[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringCheck str = sc.nextLine();
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        System.out.println(hm);
        for(Character x:hm.keySet()){
            if(hm.get(x)==1){
                System.out.print("The first non-repeating character is: "+x);
                break;
            }
      }
    }
}
