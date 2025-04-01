import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Check if num1 is a multiple of num2 using the remainder operator
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        input.close();
    }
}
