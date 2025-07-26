
public class NeonNumber {
    public static void main(String[] args) {
        int n=13;
        if(n==sumOfdigits(n)){
            System.out.println("neon");
        }else{
            System.out.println("not");
        }
    }
    public static int sumOfdigits(int n){
        int sq=n*n;
        int sum=0;
        while(sq!=0){
            sum+=sq%10;
            sq/=2;

        }
        return sum;
    }
}
