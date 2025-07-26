/*A number is called a perfect number if it is equal to the sum of its proper divisors 
(excluding itself). For example, 6 is a perfect number because its divisors are 1, 2, and 3, and their sum is 6.*/

public class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println(sum==n?"perfect number":"not perfect number");
    }
}
