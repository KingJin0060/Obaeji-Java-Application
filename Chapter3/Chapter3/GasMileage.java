import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0, totalGallons = 0;
        int miles, gallons;

        while (true) {
            System.out.println("Enter miles driven (-1 to stop): ");
            miles = scanner.nextInt();
            if (miles == -1) break;

            System.out.println("Enter gallons used: ");
            gallons = scanner.nextInt();

            totalMiles += miles;
            totalGallons += gallons;

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f\n", mpg);
            System.out.printf("Combined miles per gallon: %.2f\n", (double) totalMiles / totalGallons);
        }

        scanner.close(); // Close the scanner after use
    } // Close main method
} // Close GasMileage class
