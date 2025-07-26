package Number_converter;
public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        int num= 10101;
        int decimal=0;
        int power=1;
        while(num!=0){
            int dig=num%10;
            if(dig==0){
                decimal+=power;
            }
            power*=2;
            num/=10;
        }
        System.out.println(decimal);
        
    }
}