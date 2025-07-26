package Collections;

public class Devide {
    public static void main(String[] args) {
        int n=1248;
        System.out.println(count(n));

    }
    public static int count(int n){
        int original=n;
        int count=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){ 
            if(original%rem ==0) count++;
            }
            n/=10;
        }
        return count;
    }
}
