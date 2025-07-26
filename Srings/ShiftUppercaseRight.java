package Srings;

public class ShiftUppercaseRight {
    public static void main(String[] args) {
        String str="HiThere";
        StringBuilder low=new StringBuilder();
        StringBuilder up=new StringBuilder();
        for (char ch:str.toCharArray()) {
            if (Character.isUpperCase(ch)){
                up.append(ch);     
            }else{
                low.append(ch);      
            }
        }

        String str2 =low.toString()+up.toString();
        System.out.println(str2);
}
}