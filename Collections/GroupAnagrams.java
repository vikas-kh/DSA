package Collections;

import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args){
        String [] arr={"eat", "tea", "tan", "ate", "nat", "bat"};
        for(List<String> i: groupAnagrams(arr)){
            System.out.println(i);
        }
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new LinkedHashMap<>();
        for(String str:strs){
            char [] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
        }
        List<List<String>> result=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
