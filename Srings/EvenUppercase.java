package Srings;

public class EvenUppercase {
    public static void main(String[] args) {
        String str="abcdef";
        String str2="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)+1)%2==0){
                str2+=(str.charAt(i)+"").toUpperCase();
            }else{
                str2+=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
