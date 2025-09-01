package leetcode;

import java.util.*;

public class Leetcode20 {
    public static boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
        // System.out.println(s.charAt(0));
        // System.out.println(s.length());
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push('(');
            if(s.charAt(i)=='[') stack.push('[');
            if(s.charAt(i)=='{') stack.push('{');
            if(stack.isEmpty()){
                return false;
            }
            if(s.charAt(i)==')'){
                char a=stack.peek();
                if(a!=('(')){
                    return false;
                }
                stack.pop();
            }
            if(s.charAt(i)=='}'){
                char a=stack.peek();
                if(a!=('{')){
                    return false;
                }
                stack.pop();
            }
            if(s.charAt(i)==']'){
                char a=stack.peek();
                if(a!=('[')){
                    return false;
                }
                stack.pop();
            }
            

        }
        return stack.isEmpty() ? true : false; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("String: ");
        String s=sc.next();
        System.out.println(isValid(s)); 
    }
    
}
