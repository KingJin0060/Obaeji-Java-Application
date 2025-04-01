import java.util.Scanner;

public class SamplePayrollCalculation {

    public static void main(String[] args) {

        // a) Display the message "Enter an integer: ", leaving the cursor on the same line.
        System.out.print("Enter an integer: "); // The print method doesn't move to the next line.

        // b) Assign the product of variables b and c to variable a.
        // Declare variables for the integers
        int a, b, c;

        // For demonstration, we will initialize b and c. In real use, they might be input by the user.
        b = 5;  // Example value for b
        c = 10; // Example value for c

        // Assign the product of b and c to a
        a = b * c;

        // c) Use a comment to state that the program performs a sample payroll calculation.
        // This is just a placeholder message.
        // In a real program, payroll calculations would involve employee wages, hours worked, etc.
        System.out.println("This program performs a sample payroll calculation.");
        
        // Display the result of the product
        System.out.printf("The product of %d and %d is %d.%n", b, c, a);
    }
}
