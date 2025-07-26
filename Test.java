public class Test {
    public static void main(String[] args) {
        String s = "Qsbobnzb!uif!npolfz";
        for (int i = 0; i < "hello".length(); i++) {
            for (char c : s.toCharArray())
                System.out.print((char)(c - 1));
            System.out.println();
        }    
    }
}