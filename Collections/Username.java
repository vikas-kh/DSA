package Collections;

public class Username {
    public static void main(String[] args) {
        String str="a_bc";
        System.out.println(checkValidity(str));
    }
    public static boolean checkValidity(String str){
        String regex="[A-za-z][A-za-z0-9]{7,29}";
        return str.matches(regex);
    }
    
}
