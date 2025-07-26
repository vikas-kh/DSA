package Collections;
import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        Integer arr[] = {3, 1, 2, 5, 6, 4};
        System.out.println(kthLargest(arr, 4));
             
    }
     static int kthLargest(Integer arr[], int k) {
        Arrays.sort(arr,(a, b)->b-a); 
        return arr[k-1];
    }
}
