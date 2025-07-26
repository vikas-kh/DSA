package Collections;

public class StringCompression {
    public static void main(String[] args) {
        String str="aabcccccaaa";
        System.out.println(compression(str));
    }
    public static String compression(String str){
        
        String str1="";
        for(int i=0;i<str.length();){
            char currentChar=str.charAt(i);
            int count=1;
            int j;
            for( j=i+1;j<str.length();j++){
                
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            
            
            str1 += currentChar + "" + count;
            i=j;
            
        }
        return str1;
    }
}
