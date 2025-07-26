package Srings;
// public class palindrome {
//     public static void main(String[] args){
//         String str="madam";
//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(str.length()-1-i)){
//                 System.out.println("not ");
//                 return;
//             }else{
//                 System.out.println("palindrome");
//                 return;
//             }
//         }
//     }
// }

//using string builder
public class palindrome{
    public static void main(String[] args) {
        String str="leve";
        System.out.println(reversed(str).equals(str)?" Palindrome":"Not a Palindrome");
    }
    static String reversed(String str){
        StringBuilder reverseString=new StringBuilder();
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            reverseString.append(arr[i]);
        }
        return reverseString.toString();
    }
}