 import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int number;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}