package Collections;

import java.util.ArrayList;
import java.util.*;
public class FindAllSubstring {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(substring(str));
    }
    public static List<String> substring(String str){
        List<String> arr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            StringBuilder str2=new StringBuilder();
            for(int j=i;j<str.length();j++){
                str2.append(str.charAt(j));
                arr.add(str2.toString());
            }
        }
        return arr; 
    }
}
