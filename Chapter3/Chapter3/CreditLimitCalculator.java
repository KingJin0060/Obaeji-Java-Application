import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number (enter -1 to quit): ");
        int accountNumber = scanner.nextInt();

        while (accountNumber != -1) {
            System.out.println("Enter balance at the beginning of the month: ");
            int beginningBalance = scanner.nextInt();

            System.out.println("Enter total charges this month: ");
            int charges = scanner.nextInt();

            System.out.println("Enter total credits this month: ");
            int credits = scanner.nextInt();

            System.out.println("Enter credit limit: ");
            int creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + charges - credits;
            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Credit limit not exceeded");
            }

            System.out.println("\nEnter account number (enter -1 to quit): ");
            accountNumber = scanner.nextInt();
        }
    }
}