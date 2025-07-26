package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={9,5,10,10,6,8};
        System.out.println(seclargest(arr));
    }
   public static int seclargest(int []arr){
    if(arr==null) return -1;
    if(arr.length==0 || arr.length==1) return -1;
    int max=arr[0];
    int secondMax=Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }else if(arr[i]>secondMax && arr[i]!=max){
            secondMax=arr[i];
        }
    }
    return secondMax;
   }
}
