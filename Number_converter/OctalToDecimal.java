package Number_converter;
public class OctalToDecimal{
    public static void main(String[] args){
        int num =173; 
        int powerval=1;
        int decimal=0;
        while(num!=0){
            int rem=num%10;
            decimal+=powerval*rem;
            powerval*=8;
            num=num/10;
        }   
        System.out.println(decimal);
    }
}