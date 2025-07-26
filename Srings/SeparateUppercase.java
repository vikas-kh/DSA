package Srings;

public class SeparateUppercase {
    public static void main(String[] args) {
         String str="AAabGfgc23";
         System.out.println(lower(str));
         System.out.println(upper(str));
         System.out.println(numbers(str));
    }
    public static String lower(String str){
       String a="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                a+=str.charAt(i);
            }
        }
        return a;
    }

    public static String upper(String str){
       String a="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=90 && str.charAt(i)>=65){
                a+=str.charAt(i);
            }
        }
        return a;
    }
    
    public static String numbers(String str){
    String a="";
    for(int i = 0;i<str.length(); i++){
        if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
            a += str.charAt(i);
        }
    }
    return a;
}
}
