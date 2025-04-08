import java.util.*;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String keyword=sc.nextLine();
        
        if(str.contains(keyword))
        {
            System.out.println("FOUND");
        }
        else
        {
            System.out.println("NOT FOUND");
        }
        
        String str1=str.replace("a","b");
        System.out.println(str1);
        System.out.println();

        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);

        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse().toString());

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.print(entry.getKey()+" "+entry.getValue());
        }

        sb=new StringBuilder(str);
        sb.append("- End");
        System.out.println(sb.toString());

        sc.close();
    }
}
