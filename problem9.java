import java.util.Arrays;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Check if the integer is a two-digit special integer
        boolean isSpecial = isTwoDigitSpecialInteger(num);

        // Display the result
        if (isSpecial) {
            System.out.println(num + " is a two-digit special integer.");
        } else {
            System.out.println(num + " is not a two-digit special integer.");
        }

        scanner.close();
    }
    public static boolean isTwoDigitSpecialInteger(int num) {
        if (num < 10 || num > 99) {
            return false; // Not a two-digit integer
        }
        int tensDigit = num / 10;
        int onesDigit = num % 10;
        int product = tensDigit * onesDigit;

        return (tensDigit + onesDigit + product) == num;
    }


}
