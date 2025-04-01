// Program 7: CarbonFootprintCalculator.java
import java.util.Scanner;

public class CarbonFootprintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for transportation (e.g., miles driven)
        System.out.print("Enter miles driven per year: ");
        double milesDriven = scanner.nextDouble();

        // Carbon footprint based on miles driven (example: 0.411 kg CO2 per mile)
        double carbonFootprintFromCar = milesDriven * 0.411;

        // Input for energy consumption (e.g., kWh of electricity)
        System.out.print("Enter annual electricity consumption in kWh: ");
        double electricityConsumed = scanner.nextDouble();

        // Carbon footprint from electricity (example: 0.92 kg CO2 per kWh)
        double carbonFootprintFromElectricity = electricityConsumed * 0.92;

        // Total carbon footprint
        double totalCarbonFootprint = carbonFootprintFromCar + carbonFootprintFromElectricity;

        System.out.println("Your total carbon footprint is: " + totalCarbonFootprint + " kg of CO2.");
    }
}
