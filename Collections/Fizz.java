package Collections;

public class Fizz{
    public static void main(String[] args) {
        int n=15;
        print(n);
    }
    public static void print(int n){
        for (int i = 1; i <=n; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizBuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
