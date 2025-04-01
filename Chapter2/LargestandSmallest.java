import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare the variables to store five integers
        int num1, num2, num3, num4, num5;
        
        // Prompt the user for input
        System.out.print("Enter five integers: ");
        
        // Read the integers
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        
        // Find the largest and smallest integers
        int largest = num1;
        int smallest = num1;
        
        if (num2 > largest) largest = num2;
        if (num2 < smallest) smallest = num2;
        
        if (num3 > largest) largest = num3;
        if (num3 < smallest) smallest = num3;
        
        if (num4 > largest) largest = num4;
        if (num4 < smallest) smallest = num4;
        
        if (num5 > largest) largest = num5;
        if (num5 < smallest) smallest = num5;
        
        // Display the result
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        
        // Close the scanner
        input.close();
    }
}
