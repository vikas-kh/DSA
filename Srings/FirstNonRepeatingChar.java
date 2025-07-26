package Srings;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="aabccdeff";
        int n = str.length();
        for (int i=0;i<n;i++) {
            char ch=str.charAt(i);
            boolean flag = true;

            for (int j=i+1;j<n;j++){
                if (i!=j && str.charAt(j)==ch) {
                    flag=false;
                    break;
                }
            }
            
            if (flag){
                System.out.println(ch);
                return;
            }
        }

        System.out.println("no");
    }
}

