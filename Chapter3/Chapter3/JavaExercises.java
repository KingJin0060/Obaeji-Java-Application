import java.util.Scanner;

public class JavaExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 3.10 - Compare and contrast the if and while statements
        // This is a conceptual explanation, so no implementation needed here.

        // 3.11 - Division of integers in Java
        System.out.println("3.11 - Integer Division Example");
        int a = 7, b = 3;
        System.out.println("Integer division of 7 / 3: " + (a / b));  // Result is 2 (fraction is lost)
        double c = 7.0, d = 3;
        System.out.println("Floating-point division of 7.0 / 3: " + (c / d));  // Result is 2.3333
        System.out.println();

        // 3.12 - Combining control statements
        System.out.println("3.12 - Nested control statements");
        int age = 30;
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Senior citizen.");
            } else {
                System.out.println("Adult.");
            }
        } else {
            System.out.println("Minor.");
        }
        System.out.println();

        // 3.13 - Appropriate repetition for calculating the sum
        System.out.println("3.13 - Sum of the first 100 positive integers");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of the first 100 integers: " + sum);

        System.out.println("Sum of an arbitrary number of integers");
        int totalSum = 0;
        int inputNumber;
        System.out.println("Enter integers to sum (enter -1 to stop): ");
        while ((inputNumber = scanner.nextInt()) != -1) {
            totalSum += inputNumber;
        }
        System.out.println("Total sum: " + totalSum);
        System.out.println();

        // 3.14 - Preincrementing vs postincrementing
        System.out.println("3.14 - Preincrement vs Postincrement");
        int x = 5, y = ++x;  // Preincrement
        int z = x++;  // Postincrement
        System.out.println("Preincrement: x = " + y);  // 6
        System.out.println("Postincrement: z = " + z + ", x = " + x);  // 6, 7
        System.out.println();

        // 3.15 - Correcting code errors
        System.out.println("3.15 - Correcting code errors");
        // Fixed error in a)
        int age2 = 70;
        if (age2 >= 65) {
            System.out.println("Age is greater than or equal to 65");
        } else {
            System.out.println("Age is less than 65");
        }

        // Fixed error in b)
        int x2 = 1, total = 0;
        while (x2 <= 10) {
            total += x2;
            ++x2;
        }
        System.out.println("Sum using while loop: " + total);

        // Fixed error in c)
        int x3 = 1, total2 = 0;
        while (x3 <= 100) {
            total2 += x3;
            ++x3;
        }
        System.out.println("Sum using while loop up to 100: " + total2);

        // Fixed error in d)
        int y2 = 10;
        while (y2 > 0) {
            System.out.println(y2);
            --y2;
        }
        System.out.println();

        // 3.17 - Gas Mileage
        System.out.println("3.17 - Gas Mileage");
        int totalMiles = 0, totalGallons = 0;
        int miles, gallons;
        while (true) {
            System.out.println("Enter miles driven (-1 to stop): ");
            miles = scanner.nextInt();
            if (miles == -1) break;

            System.out.println("Enter gallons used: ");
            gallons = scanner.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
            System.out.printf("Combined miles per gallon: %.2f\n", (double) totalMiles / totalGallons);
        }
        System.out.println();

        // 3.18 - Credit Limit Calculator
        System.out.println("3.18 - Credit Limit Calculator");
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
        System.out.println();

        // 3.19 - Sales Commission Calculator
        System.out.println("3.19 - Sales Commission Calculator");
        double totalSales, commissionRate = 0.09, baseSalary = 200;
        double totalEarnings;
        System.out.println("Enter total sales for the week: ");
        totalSales = scanner.nextDouble();
        totalEarnings = baseSalary + (commissionRate * totalSales);
        System.out.println("Total earnings: $" + totalEarnings);
        System.out.println();

        // 3.20 - Salary Calculator
        System.out.println("3.20 - Salary Calculator");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter hourly rate for employee " + i + ": ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours worked for employee " + i + ": ");
            int hoursWorked = scanner.nextInt();

            double grossPay = (hoursWorked > 40) ? 
                (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5) : 
                (hoursWorked * hourlyRate);
                
            System.out.println("Gross pay for employee " + i + ": $" + grossPay);
        }
        System.out.println();

        // 3.21 - Find the Largest Number
        System.out.println("3.21 - Find the Largest Number");
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            int inputNum = scanner.nextInt();
            if (inputNum > largest) {
                largest = inputNum;
            }
        }
        System.out.println("The largest number is: " + largest);
        System.out.println();

        // 3.22 - Tabular Output
        System.out.println("3.22 - Tabular Output");
        System.out.println("Number\tSquare");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\t%d\n", i, i * i);
        }
        System.out.println();

        // 3.23 - Find the Two Largest Numbers
        System.out.println("3.23 - Find the Two Largest Numbers");
        int largest1 = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            int inputNum = scanner.nextInt();
            if (inputNum > largest1) {
                secondLargest = largest1;
                largest1 = inputNum;
            } else if (inputNum > secondLargest) {
                secondLargest = inputNum;
            }
        }
        System.out.println("The largest number is: " + largest1);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
