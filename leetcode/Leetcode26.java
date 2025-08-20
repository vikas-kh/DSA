package leetcode;
//26. Remove Duplicates from Sorted Array
//there are duplicate elements so use the set
import java.util.*;
public class Leetcode26 {
    public static  int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for(int x:set) nums[i++]=x;
        return i;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int nums2[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));

    }
}
