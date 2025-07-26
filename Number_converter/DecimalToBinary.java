package Number_converter;
public class DecimalToBinary{
    public static void main(String[] args) {
        int n=20;
        String binary="";
        while(n>0){
            binary=(n % 2)+binary;
            n/=2;
        }
        System.out.println(binary);

    }
}