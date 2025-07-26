package Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,3,4};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        if(arr==null){
            return  -1;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
