package Collections;

import java.util.*;
public class Good {
    public static void main(String[] args) {
        int[] arr={3, 4, 4, 1, 2, 1};
        System.out.println(isGood(arr));
    }
    public static boolean isGood(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        if(nums.length!=max+1) return false;
        int []base=new int[max+1];
        int j=0;
        for(int i=1;i<=max;i++){
            base[j]=i;
            j++;
        }
        base[j]=max;
        Arrays.sort(nums);
        boolean falg=true;
        if(base.length==nums.length){
            for(int i=0;i<nums.length;i++){
            if(base[i]!=nums[i]){
                return false;
            }
        }
        
        }
        return true;
        
    }
}
