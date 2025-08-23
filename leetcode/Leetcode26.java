package leetcode;
//26. Remove Duplicates from Sorted Array
//there are duplicate elements so use the set
import java.util.*;
public class Leetcode26 {
    public static  int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int i = 0;
    for (int x : set) {
        nums[i++] = x;
    }
    return set.size();
    }
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int nums2[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));

    }
}
