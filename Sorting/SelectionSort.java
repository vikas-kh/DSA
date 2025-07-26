package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,5,3,4,9,1};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min=j;
            }
            swap(arr,i,min);
        }
        return arr;
    }
    public static int[] swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    
}
