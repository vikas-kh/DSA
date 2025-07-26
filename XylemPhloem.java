public class XylemPhloem {
    public static void main(String[] args) {
        int n=1234;
        int last=lastDigit(n);
        n=n/10;
        int sum=0,midsum=0;
        while(n>9){
            n=lastDigit(n);
            n=n/2;
            midsum+=n;
        }
        int first=lastDigit(n);
        sum=first+last;
        if(sum==midsum){
            System.out.print("Xylem");
        }else{
            System.out.println("plhoem");
        }
    }
    public static int lastDigit(int n){
        return n%10;
       }
}

// public class XylemPhloem{
//     public static void main(String[] args) {
//         int num=4321;
//         int extreemeSum=num%10;
//         num/=10;
//         int meanSum=0;
//         while(num>9){
//             meanSum+=num%10;
//         }
//     }
// }
