import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int number;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}