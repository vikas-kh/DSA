package Collections;
import java.util.*;
public class EvenPalindrome {
    public static void main(String[] args) {
        String str = "For her good deed she was praise yesterday at noon and was promoted to next level";
        List<String> result=new ArrayList<>();
        for(String word : str.split(" ")) {
            if (word.length()%2==0&&isPalindrome(word)) {
                result.add(word);
            }
        }
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        
        while (left<right) {
            if (str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
