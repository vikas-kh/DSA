package Collections;

public class AmazingPattern {
    public static void main(String[] args) {
        int n=9;
        System.out.println(compleated(n));
    }
    public static int compleated(int n){
        int coins=1;
        int rows=0;
        while(n>0){
            n-=coins;
            coins++;
            if(n>0)rows++;
        }
        return rows;
    }

}
