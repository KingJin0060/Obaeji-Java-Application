import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger\n", num1);
        } else if (num1 < num2) {
            System.out.printf("%d is larger\n", num2);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
