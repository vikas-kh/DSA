public class LargestOfFour {
    public static void main(String[] args) {
        int num1=8;
        int num2=10;
        int num3=25;
        int num4=23;
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println(num1);
        }else if(num2>num3 && num2>num4){
            System.out.println(num2);
        }else if(num3>num4){
            System.out.println(num3);
        }else{
            System.out.println(num4);
        }
    }
}
