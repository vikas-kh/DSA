package Srings;

// public class Pangram {
//     public static void main(String[] args) {
//         String a="abcdefghijklmnopqrstuvwxyz";
//         String str="a b c defghijklmnopqrstuv wxyz";
        
//         boolean flag=false;
        
//         for (int i=0;i<a.length();i++) {
//             flag=false;
//             for(int j=0;j<str.length();j++){
//                 if(a.charAt(i)==str.charAt(j)){
//                     flag=true;
//                 }
//             }
//             if(flag==false){
//                 break;
//             }
//         }
        
//         if(flag==true){
//             System.out.println("pangram");
//         }else{
//             System.out.println("not");
//         }
//     }
// }


public class Pangram{
    public static void main(String[] args) {
        String a="abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPangram(a));
    }
    static boolean isPangram(String str){
        str=str.toLowerCase();
        for(char c='a'; c<='z';c++){
            if(str.contains(String.valueOf(c))==false){
                return false;
            }
        }
        return true;
    }
}