public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        int sum=0;
        int length=0;
        int arr[]=new int[30];
        int i=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            length++;
            arr[i++]=rem;
        }
        for(int j=0;j<length;j++){
            sum+=Math.pow(arr[j],length);
        }        
        System.out.println(sum==original?"amstrong":"not amstrong");

    }
}
