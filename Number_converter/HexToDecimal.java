package Number_converter;
public class HexToDecimal {
    public static void main(String[] args){
        String str = "fff"; 
        int decimal = 0;
        int power=1;
        int n=87;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>57){
                decimal+=((int)str.charAt(i)-87)*power;
                power*=16;
            }else{
                decimal+=(Math.abs(48-(int)str.charAt(i)))*power;
                power*=16;
            }
        }
        System.out.println(decimal);
    } 
}