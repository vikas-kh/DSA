package Srings;

// public class NoOfVovels {
//     public static void main(String[] args) {

//         String str="hello";
//         vovels(str);

//     }
//     public static void vovels(String str){
//         String a="aeiou";
//          boolean flag=false;
//         int count=0;
//         int count2=0;
//         for (int i=0;i<a.length();i++) {
//             flag=false;
//             for(int j=0;j<str.length();j++){
//                 if(a.charAt(i)==str.charAt(j)){
//                     flag=true;
//                     count++;
//                 }
//             }
//             if(flag==false){
//                     count2++;
//                 }
//         }
//         System.out.println("vovels: "+count+" "+"consonents: "+count2);
//     }

// }

class NoOfVovels{
    public static void main(String[] args) {
        String str="Education";
        str=str.toLowerCase();
        int vowels=0;
        int consonents=0;
        String vow="aeiou";
        for(int i=0;i<str.length();i++){
            if(vow.contains(String.valueOf(str.charAt(i)))){
                vowels++;
            }else{
                consonents++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);
    }
}