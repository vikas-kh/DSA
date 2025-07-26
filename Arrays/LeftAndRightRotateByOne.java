package Arrays;

public class LeftAndRightRotateByOne{

    //Left ratate from mid by one
    public static void main(String[] args) {
        int []arr={1,4,2,3,4,5,2,10};
        leftRotate(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        
         int []arr2={1,4,2,3,4,5,2,10};
         System.out.println();
        rightRotate(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
    public static int[] leftRotate(int[] arr) {
        int mid=arr.length/2;
        int temp=arr[mid];
        for (int i=mid;i<arr.length-1;i++) {
            arr[i]=arr[i + 1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    //right rotate from mid by one
     
    public static int[] rightRotate(int[] arr) {
        int mid=arr.length/2;
        int temp=arr[arr.length-1];
        for (int i=arr.length-1;i>=mid;i--) {
            arr[i]=arr[i-1];
        }
        arr[mid]=temp;
        return arr;
    }

}
