package Arrays;
import java.util.ArrayList;
import java.util.List;
public class PrimeInSecondHalf {
    public static void main(String[] args) {
        int[] arr={3,5,3,5,6,5,3,2,9,7,15};
        System.out.println(primeInSecondHalf(arr));
    }
    static List<Integer> primeInSecondHalf(int []arr){
            List<Integer> prime=new ArrayList<>();
            for(int i=arr.length/2;i<arr.length;i++){
                if(isPrime(arr[i])){
                    prime.add(arr[i]);
                }
            }
            return prime;
    }
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)return false;
        }
        return true;
        }
}
