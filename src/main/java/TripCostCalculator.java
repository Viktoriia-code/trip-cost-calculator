import java.util.Scanner;

public class TripCostCalculator {
    public static double calculateTripCost(double distance, double fuelPrice, double fuelConsumption) {
        double fuelNeeded = (distance / 100) * fuelConsumption;
        return fuelNeeded * fuelPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance of the trip in km:");
        double distance = scanner.nextDouble();

        System.out.println("Enter the price of fuel per litre:");
        double fuelPrice = scanner.nextDouble();

        double fuelConsumption = 5.0;

        double tripCost = calculateTripCost(distance, fuelPrice, fuelConsumption);

        System.out.println("The cost of the trip is: " + tripCost);
    }
}
