package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,5,3,4,9,1};
        Sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] Sort(int []arr){
        
        for(int i=0;i<arr.length-1;i++){
            int flag=1;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    flag=0;
                }
            }
            if(flag==1){
                return arr;
            }
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
