import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hourlyRate, grossPay;
        int hoursWorked;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter hourly rate for employee " + i + ": ");
            hourlyRate = scanner.nextDouble();

            System.out.println("Enter hours worked for employee " + i + ": ");
            hoursWorked = scanner.nextInt();

            if (hoursWorked > 40) {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            } else {
                grossPay = hoursWorked * hourlyRate;
            }

            System.out.println("Gross pay for employee " + i + ": $" + grossPay);
        }
    }
}