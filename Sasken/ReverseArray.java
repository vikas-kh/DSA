package Sasken;

public class ReverseArray {
    public static void main(String[] args){
        int arr[]={1,5,2,3,8,5};
        Reverse(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void Reverse(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            
            swap(arr,l,r);
            l++;
            r--;
        }
        
    }
    static void swap(int arr[],int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
