package Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int []arr={1,2,3,2,1};
        System.out.println(palindrome(arr));
    }
    public static boolean palindrome(int arr[]){
        int left=0;
        int right=arr.length-1;
        boolean flag=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                flag=false;
                return flag;
                
            }
            left++;
            right--;
        }
        return flag;
    }
}
