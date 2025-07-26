public class spyNumber {
    public static void main(String[] args) {
        int n=132;
        System.out.println(sumOfdigits(n)==productOfdigits(n));
    }
    public static int sumOfdigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;

        }
        return sum;
    }
    public static int productOfdigits(int n){
        int pro=1;
        while(n!=0){
            pro*=n%10;
            n/=10;

        }
        return pro;
    }
}
