package Collections;
import java.util.PriorityQueue;

public class KthLargestWithoutSorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(arr, k));
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for (int num : nums){
            minHeap.offer(num);
            if (minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }   
}
