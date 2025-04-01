import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int x, y, z, result;

        // Prompt the user for input
        System.out.print("Enter the first integer: ");
        x = input.nextInt();

        System.out.print("Enter the second integer: ");
        y = input.nextInt();

        System.out.print("Enter the third integer: ");
        z = input.nextInt();

        // Compute the product
        result = x * y * z;

        // Display the result
        System.out.printf("Product is %d%n", result);
    }
}
