public class simthNumber {
    public static void main(String[] args) {
        
        int num=666;
        int num2=num;
        int sumOfDigit=sumOfDigits(num);
        System.out.println(sumOfDigit);
        int sum=0;
        for(int i=2;i<=num2/2;i++){
            if(num%i==0){
                if(isPrime(i)){
                    while(num%i==0){
                        sum+=sumOfDigits(i);
                        num/=i;
                    }
                
                }
            }
        }
        System.out.println(sum);
        if(sumOfDigit==sum){
            System.out.println("smithnumber");
        }else{
            System.out.println("not");
        }
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
