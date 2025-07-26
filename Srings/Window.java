package Srings;

import java.util.HashSet;
import java.util.*;
public class Window {
    public static void main(String[] args) {
        String str="pwwkew";
        System.out.println(subString(str));
    }
    public static int subString(String str){
        int left=0;int right=0;int max=0;
        Set<Character> set =new HashSet<>();
        while(right< str.length()){
            char c=str.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                int curr=right-left+1;
                max=Math.max(max,curr);
                right++;
            }else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return max;
    }
    // public static int subString(String str){
    //     int p1=0;
    //     int p2=0;
    //     int max=0;
    //     int n=str.length();
    //     Set<Character> set=new HashSet<>();
        
    //     int count=0;
    //     while(p1<n-1){
            
    //     while(p2<=n){
            
    //         if(set.contains(str.charAt(p2))){
    //             set.removeAll(set);
    //             max=Math.max(count,max);
                
    //             p1=p2+1;
    //             break;
    //         }
    //         set.add(str.charAt(p2));
    //         p2++;
    //         count++;
    //     }
        
    // }
    // return count;
    // }
}
