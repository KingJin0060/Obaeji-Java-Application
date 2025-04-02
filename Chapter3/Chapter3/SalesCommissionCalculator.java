import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSales, commissionRate = 0.09, baseSalary = 200;
        double totalEarnings;

        System.out.println("Enter total sales for the week: ");
        totalSales = scanner.nextDouble();

        totalEarnings = baseSalary + (commissionRate * totalSales);
        System.out.println("Total earnings: $" + totalEarnings);
    }
}