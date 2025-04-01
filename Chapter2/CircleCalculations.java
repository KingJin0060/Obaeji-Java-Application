import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        // Calculate diameter, circumference, and area
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.printf("Diameter: %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);

        input.close();
    }
}
