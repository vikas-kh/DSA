public class Bouncy {
    public static void main(String[] args) {
        int num=192837;
        String str=Integer.toString(num);
        if(num<100) System.out.println("not boncy number");
        else if(ascending(str) || descending(str)) System.out.println("not bouncy number");
        else System.out.println("Bouncy number");
    }
    static boolean ascending(String num){
        boolean flag=true;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)>num.charAt(i+1)){
                flag=false;
                break;
            }
        }
        if(flag) return true;
        return false;
    }
    static boolean descending(String num){
        boolean flag=true;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)<num.charAt(i+1)){
                flag=false;
                break;
            }
        }
        if(flag) return true;
        return false;
    }
    
}
