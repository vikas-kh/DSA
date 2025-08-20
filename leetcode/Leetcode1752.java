package leetcode;
//1752. Check if Array Is Sorted and Rotated
class Leetcode1752{
    static public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }        
        
        
        return count <= 1;

    }
    public static void main(String[] args){ 
        int[] arr={2,1,3,4};
        System.out.println(check(arr));
    }
}
//