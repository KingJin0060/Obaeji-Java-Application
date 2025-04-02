import java.util.Scanner;

public class Chapter3Exercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercise 1: Part a) Example of the if-else statement
        System.out.println("Exercise 1.10: if statement example");
        int age = 70;
        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        } else {
            System.out.println("Age is less than 65");
        }

        // Exercise 1: Part b) Example of the while loop (sum of the first 100 integers)
        System.out.println("\nExercise 1.13: Sum of the first 100 integers using a for loop");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {  // Changed 'x' to 'i' here
            sum += i;
        }
        System.out.println("Sum of first 100 integers: " + sum);

        // Exercise 1: Part c) Division with truncation of the fractional part
        System.out.println("\nExercise 1.11: Integer division");
        int result = 5 / 2; // Fractional part is discarded
        System.out.println("Result of 5 / 2: " + result);

        // Exercise 1: Part d) Correcting errors in code
        System.out.println("\nExercise 1.15: Correcting code errors");
        int total = 0;
        int x = 1;
        while (x <= 10) {
            total += x;
            x++;
        }
        System.out.println("Total after summing numbers 1 to 10: " + total);

        // Exercise 2.17: Gas Mileage Program
        System.out.println("\nExercise 2.17: Gas Mileage");
        int miles, gallons;
        double totalMiles = 0, totalGallons = 0;
        while (true) {
            System.out.print("Enter miles driven (or -1 to stop): ");
            miles = input.nextInt();
            if (miles == -1) {
                break;
            }
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();
            double mpg = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + mpg);
            totalMiles += miles;
            totalGallons += gallons;
        }
        double totalMPG = totalMiles / totalGallons;
        System.out.println("Total miles per gallon: " + totalMPG);

        // Exercise 2.18: Credit Limit Calculator
        System.out.println("\nExercise 2.18: Credit Limit Calculator");
        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter beginning balance: ");
        int beginningBalance = input.nextInt();
        System.out.print("Enter total charges: ");
        int charges = input.nextInt();
        System.out.print("Enter total credits: ");
        int credits = input.nextInt();
        System.out.print("Enter credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credits;
        System.out.println("New balance: " + newBalance);
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit limit not exceeded");
        }

        // Exercise 2.19: Sales Commission Calculator
        System.out.println("\nExercise 2.19: Sales Commission Calculator");
        final double WEEKLY_SALARY = 200;
        final double COMMISSION_RATE = 0.09;
        System.out.print("Enter total sales for the week: ");
        double sales = input.nextDouble();
        double commission = sales * COMMISSION_RATE;
        double totalEarnings = WEEKLY_SALARY + commission;
        System.out.println("Salesperson's earnings for the week: $" + totalEarnings);

        // Exercise 2.20: Salary Calculator (Straight time and overtime)
        System.out.println("\nExercise 2.20: Salary Calculator");
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;
        System.out.print("Enter number of hours worked: ");
        int hoursWorked = input.nextInt();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = input.nextDouble();

        double grossPay;
        if (hoursWorked > REGULAR_HOURS) {
            grossPay = (REGULAR_HOURS * hourlyRate) + ((hoursWorked - REGULAR_HOURS) * hourlyRate * OVERTIME_RATE);
        } else {
            grossPay = hoursWorked * hourlyRate;
        }
        System.out.println("Gross pay: $" + grossPay);

        // Exercise 2.21: Find the Largest Number
        System.out.println("\nExercise 2.21: Find the Largest Number");
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {  // Changed 'x' to 'i' here too
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest number is: " + largest);

        // Exercise 2.22: Tabular Output (for a table of values)
        System.out.println("\nExercise 2.22: Tabular Output");
        System.out.println("X   X^2   X^3");
        for (int num = 1; num <= 5; num++) {  // Changed 'x' to 'num' here
            System.out.printf("%d   %d    %d\n", num, num * num, num * num * num);
        }

        // Exercise 2.23: Find the Two Largest Numbers
        System.out.println("\nExercise 2.23: Find the Two Largest Numbers");
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("The two largest numbers are: " + firstLargest + " and " + secondLargest);
    }
}
