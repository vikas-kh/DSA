

public class Duplicate {
    public static void main(String[] args) {
        String str = "programming";
        int n = str.length();
        int count = 0;  // to limit to 3 positions

        System.out.println("Duplicate characters and their positions:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(i) + " → " + i + ", " + j);              
                }
            }
        }
    }
}
