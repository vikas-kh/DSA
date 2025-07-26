package Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        reverse(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] reverse(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
        return arr;
    }
    public static int[] swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
