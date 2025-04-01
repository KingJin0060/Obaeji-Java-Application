import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int c, thisIsAVariable, q76354, number, value;

        // Declare other variables for the product calculation program
        int x, y, z, result;

        // a) Declare variables c, thisIsAVariable, q76354, and number to be of type int.
        c = thisIsAVariable = q76354 = number = 0;

        // b) Prompt the user to enter an integer.
        System.out.print("Enter an integer: ");
        value = input.nextInt();

        // c) Input an integer and assign the result to int variable value.
        System.out.println("You entered: " + value);

        // d) Print "This is a Java program" on one line in the command window.
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines in the command window. 
        // The first line should end with Java.
        System.out.printf("This is a %s%nprogram", "Java");

        // f) If the variable number is not equal to 7, display "The variable number is not equal to 7"
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        // g) Prompt user to enter three integers for product calculation.
        System.out.print("\nEnter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        // h) Compute the product of the three integers and assign it to result.
        result = x * y * z;

        // i) Use System.out.printf to display the message "Product is" followed by the value of the result.
        System.out.printf("Product is %d%n", result);
    }
}
