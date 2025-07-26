package Arrays;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println("fibonacci is "+fib(n));
        }
        
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int fib=fib(n-1)*fib(n-2);
        return fib;
    }
}