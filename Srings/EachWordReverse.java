package Srings;

public class EachWordReverse {
    public static void main(String[] args) {
        String str="Java is a programming language";
        System.out.println(StringSplit(str));
    }
    public static String StringSplit(String str){
        String[] arr=str.split(" ");
        String a="";
        for(int i=0;i<arr.length;i++){
            a+=Rotate(arr[i])+" ";
        }
        return a;
    }
    public static String Rotate(String str){
         StringBuilder reverseString=new StringBuilder();
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            reverseString.append(arr[i]);
        }
        return reverseString.toString();
    }
}
