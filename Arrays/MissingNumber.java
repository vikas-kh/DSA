package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1}; 
        System.out.println(findMissingNumber(arr));
        
        }

        public static int findMissingNumber(int[] arr){
        int sum=0;
        int realSum=(arr.length+1)*(arr.length+2)/2;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return realSum-sum;
        }
}
