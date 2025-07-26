package Srings;

public class Ntimes {
    public static void main(String[] args) {
    String str="abc";
    int n=0;
    String str2="";
    for(int j=0;j<str.length();j++){
    for(int i=0;i<n;i++){
        str2+=str.charAt(j);
    }   
    }
        System.out.println(str2);
    }
    
}
