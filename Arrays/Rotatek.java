package Arrays;

public class Rotatek {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        rotate(arr, 3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] rotate(int arr[],int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<arr.length-1;j++){
                swap(arr,j,j+1);
            }
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
