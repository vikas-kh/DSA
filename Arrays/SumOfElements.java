package Arrays;
//int arr[]  array refference 
//int [] arr=new int[5];  array declaration and initialization
public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println("Sum is:"+sum);
    }
}
