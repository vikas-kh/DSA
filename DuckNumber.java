public class DuckNumber {
    public static void main(String[] args) {
        String num="023";
        
        if(num.charAt(0)==0){
         System.out.println("not a duck num");
        }

        else{
            int num2=Integer.parseInt(num);
            boolean flag=false;
       
        while(num2!=0){
            int dig=num2%10;
            if(dig==0){
                flag=true;
                break;
            }
            num2=num2/10;
        }
        if(flag==true){
            System.out.println("Duck number");
        }else{
            System.out.println("not");
        }
         }

        

    }
}
