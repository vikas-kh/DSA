//If a number is 
public class Strong {
    public static void main(String[] args) {
        int num=146;
        int original=num;
        int rem;
        int sum=0;
        while(num!=0){
            rem=num%10;
            num=num/10;
            sum+=fact(rem);
        }

       System.out.println(sum==original ? "Strong" : "not strong");
        
    }
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }

}
