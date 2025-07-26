package Collections;
import java.util.*;
public class BalancedDelimitors {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isBalanced(str));
    }
    static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']', '[');
        map.put('}', '{');
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if(stack.isEmpty() || map.get(ch)!=stack.pop()){
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
    
}
