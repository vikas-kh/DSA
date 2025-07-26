package Arrays;

import java.util.HashSet;

public class ArrayMerger {
    public static int[] mergeArraysWithoutDuplicates(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
    
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        int[] merged = mergeArraysWithoutDuplicates(arr1, arr2);
        
        System.out.print("Merged array without duplicates: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
