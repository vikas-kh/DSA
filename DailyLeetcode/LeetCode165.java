//165. Compare Version Numbers

package DailyLeetcode;

public class LeetCode165 {
    public static int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n1 = version1.length();
        int n2 = version2.length();

        while (i < n1 || j < n2) {
            int num1 = 0;
            int num2 = 0;


            while (i < n1 && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < n2 && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (num1 > num2) return 1;
            if (num1 < num2) return -1;

            i++;
            j++; 
        }
        return 0;
    }

    public static void main(String[] args) {
        String string1 = "1.0";
        String string2 = "1.0.0.0";
        System.out.println(compareVersion(string1, string2)); // should return -1
    }
}
