package Collections;

public class UncoupledInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        System.out.println(findUncoupledInteger(arr));
    }
    public static int findUncoupledInteger(int arr[]){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            result=result^arr[i];
        }
        return result;
    }
}