public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        int sum=sumOfSquare(n);
        while(sum>9){
            sum=sumOfSquare(sum);
        }
        if(sum==1){
            System.out.println("happy");
        }else{
            System.out.println("not happy");
        }
    }
    public static int sumOfSquare(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=Math.pow(rem,2);
            num/=10;
        }
        return sum;
    }
}
