package Sorting;
import java.util.*;
public class WaveSorting {
    public static void main(String[] args) {
            int arr[]={10,90,49,2,1,5,23};
            waveSort(arr);
            for(int i:arr){
                System.out.print(i+" ");
            }
    }
    public static int[] waveSort(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        return arr;
    }
}
