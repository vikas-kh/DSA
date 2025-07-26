package Arrays;

import java.util.ArrayList;
import java.util.*;
public class CommonElement {
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={3,4,5};
        System.out.println(commonElement(arr1, arr2)); 
    }
    static Set<Integer> commonElement(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }
        for(int num : arr2){
            if(set1.contains(num)){
                common.add(num);
            }
        } 
        return common;
    }
    
}
