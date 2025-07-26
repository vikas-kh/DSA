package Collections;

public class MaxOddLengthString{
    public static void main(String[] args) {
        String str="Go to hell";
        System.out.println(oddString(str));
    }
    public static String oddString(String str){
        String[] arr=str.split(" ");
        int max=0;
        String newStr="Better Luck next Time";
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>max && arr[i].length()%2!=0){
                max=arr[i].length();
                newStr=arr[i];

            }
        }
        
        return newStr;
    }
}