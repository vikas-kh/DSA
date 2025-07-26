public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int [] fibo=null;
        if(n==0)System.out.println(0);
        else{
            fibo=new int[n];
            fibo[0]=0;
            fibo[1]=1;
            for(int i=2;i<n;i++){
                fibo[i]=fibo[i-1]+fibo[i-2];
            }
        }
        for(int i:fibo){
            System.out.print(i+" ");
        }
    }
}
