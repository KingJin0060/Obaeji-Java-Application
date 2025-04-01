import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // Separate and print each digit
        int thousands = number / 10000;
        int hundreds = (number % 10000) / 1000;
        int tens = (number % 1000) / 100;
        int ones = (number % 100) / 10;
        int onesPlace = number % 10;

        // Print the digits with spaces in between
        System.out.println(thousands + " " + hundreds + " " + tens + " " + ones + " " + onesPlace);

        input.close();
    }
}
