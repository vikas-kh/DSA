package Collections;

public class ShiftElementsByN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 2;
        shiftElements(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] shiftElements(int[] arr, int n) {
        for(int i=n;i<arr.length;i++){
            arr[i-n]=arr[i];
        }
        for(int i=arr.length-n;i<arr.length;i++){
            arr[i]=0; 
        }
        return arr;
    }
    
}
