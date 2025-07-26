package Arrays;


public class Test {
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6, 9, 10};
        int n=arr.length;
        int[] result=new int[n];
        for (int i=0;i<n;i++) {
            int num=arr[i];
            if (num%2!=0) { 
                if(!isPrime(num)){
                    result[i]=num*num;
                } else {
                    result[i]=num;
                }
            } else { 
                if(isPrime(num)){
                    result[i]=num*num*num;
                } else {
                    result[i]=(int)Math.pow(num, n);
                }
            }
        }

        // Print result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}