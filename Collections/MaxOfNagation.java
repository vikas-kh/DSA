package Collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxOfNagation {
    public static void main(String[] args) {
        int arr[]={4,-2,-3};
        int k=1;
        System.out.println(max(arr,k));
    }
    public static int max(int[] arr,int k){
       

        int sum=0;
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        while(k>0){
            int n=pq.poll();
            n=-(n);
            pq.add(n);
            k--;
        }
        for(int i:pq){
            sum+=i;
        }return sum;
    }
}
