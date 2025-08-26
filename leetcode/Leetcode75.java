package leetcode;
public class Leetcode75 {
    
    public static void sortColors(int[] nums) {
        //bubblesort
        for(int j=0;j<nums.length;j++){
            for(int i=0;i<nums.length-j-1;i++){
                if(nums[i]>nums[i+1]){
                    swap(i,i+1,nums);
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    
    }
    public static void swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sortColors(arr);

    }
}
