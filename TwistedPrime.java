public class TwistedPrime{
    public static void main(String[] args) {
        int n=31;
        int rev=reverse(n);
        System.out.println(isPrime(n) && isPrime(rev));
    }
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return rev;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}