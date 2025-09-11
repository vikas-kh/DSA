package Sasken;
//Find the largest and smallest element in an array.
public class LargestAndSmallest {
    public static void main(String[] args){
        int arr[]={5,2,3,4,5};
        System.out.println("small element is: "+small(arr));
        System.out.println("Large Emenet is: "+large(arr));
    }
    static int small(int arr[]){
        int small=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small) small=arr[i];
        }
        return small;
    }
    static int large(int arr[]){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large) large=arr[i];
        }
        return large;
    }
}
