import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double quotient = (double) num1 / num2;  // cast to double for decimal result

        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Product: %d\n", product);
        System.out.printf("Difference: %d\n", difference);
        System.out.printf("Quotient: %.2f\n", quotient);  // formatted to 2 decimal places
    }
}
