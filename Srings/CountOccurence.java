package Srings;

import java.util.*;

// public class CountOccurence {
//     public static void main(String[] args) {
//         String str="apple";
//         String checked="";
//         for (int i = 0; i < str.length(); i++) {
//             char ch=str.charAt(i);
//             if(checked.contains((ch+"")) continue;
//             int count=0;
//             for(int j=i;j<str.length();j++){
//                 if(str.charAt(j)==ch) count++;
//             }
//             System.out.println(ch+ "=" + count);
//             checked+=ch;
//         }

//     }
// }

//optimal 

public class CountOccurence{
    public static void main(String[] args) {
        String str="apple";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
     //   Set<Entry<Character,Integer>> set=map.entrySet();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry);
            }
            
        }
    }
}
