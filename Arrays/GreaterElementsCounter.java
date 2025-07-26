package Arrays;

public class GreaterElementsCounter{
    public static void main(String[] args) {
        int[] arr={10, 2, 7, 8, 5};
        System.out.println(countElementsGreaterThanAllToRight(arr)); 
    }
    public static int countElementsGreaterThanAllToRight(int[] arr) {
        if (arr.length == 0){
            return 0;
        } 
        int count = 0;
        int maxSoFar = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }
        return count;
    }

    
}
