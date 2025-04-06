import java.util.*;


public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                char ch=str1.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            for(int i=0;i<str1.length();i++){
                char ch2=str2.charAt(i);
                map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            }
            //System.out.println(map1);
            //System.out.println(map2);
            if(map1.equals(map2)){
                System.out.println("The strings are anagrams of each other.");
            }
            else{
                System.out.println("The strings are not anagrams of each other.");
            }
        }
    }
}
