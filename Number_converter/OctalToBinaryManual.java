package Number_converter;
import java.util.Scanner;
public class OctalToBinaryManual {
    static String octalDigitToBinary(char digit) {
        int num = digit - '0'; 
        String binary = "";
        for (int i = 2; i >= 0; i--) {
            binary += ((num >> i) & 1);
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();
        String binaryResult = "";
        for (int i = 0; i < octal.length(); i++) {
            char digit = octal.charAt(i);

            if (digit < '0' || digit > '7') {
                System.out.println("Invalid octal digit: " + digit);
                return;
            }

            binaryResult += octalDigitToBinary(digit);
        }

        System.out.println("Binary equivalent: " + binaryResult);
        scanner.close();
    }
}
