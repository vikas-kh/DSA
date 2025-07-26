public class Digitsum {
    public static void main(String[] args) {
        int n=123;
        int sum=sumOfDigits(n);
        while(sum>9){
            
            sum=sumOfDigits(sum);
        }
        System.out.println(sum);
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
