package Sasken;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(Substrings(str));
    }
    static List<String> Substrings(String str){
        List<String> sub=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<str.length();j++){
                sb.append(str.charAt(j));
                sub.add(sb.toString());
            }
        }
        return sub;
    }
}
