import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();
        
        double tax = 0.0;
        if (income <= 250000) {
            tax = 0.0;
        } else if (income <= 500000) {
            tax = 0.1 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.1 * (500000 - 250000) + 0.2 * (income - 500000);
        } else {
            tax = 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
        }
        
        System.out.println("Income Tax: Rs. " + tax);
        
        scanner.close();
    }

}
