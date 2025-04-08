package Topic_WIse_Java.Stack;

import java.util.Scanner;
import java.util.*;

public class balancedbracks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="(()())";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                if(stack.isEmpty() || stack.peek()!='(')
                {
                    System.out.println("Not Balanced");
                    return;
                }
                stack.pop();
            }
            else if(ch=='}')
            {
                if(stack.isEmpty() || stack.peek()!='{')
                {
                    System.out.println("Not Balanced");
                    return;
                }
                stack.pop();
            }
            else if(ch==']')
            {
                if(stack.isEmpty() || stack.peek()!='[')
                {
                    System.out.println("Not Balanced");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
    
}
