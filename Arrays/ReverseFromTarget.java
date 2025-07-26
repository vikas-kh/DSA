package Arrays;

public class ReverseFromTarget {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int target=3;
        reverse(arr,target);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int[] reverse(int arr[],int target){
        int targetIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                targetIndex=i;
                break;
            }
        }
        int left=targetIndex;
        int right=arr.length-1;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
        System.out.println(mul(arr, targetIndex));

        return arr;
    }
    public static int[] swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static int mul(int arr[],int targetIndex){
        int mul=1;
        for (int i = targetIndex; i < arr.length; i++) {
            mul*=arr[i];
        }
        return mul;
    }
}
