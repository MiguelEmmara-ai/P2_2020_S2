package Week01.Exercise06;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of miles: ");
        float miles = scanner.nextFloat();

        System.out.println("Enter the gallons of fuel used: ");
        float gallonsOfFuel = scanner.nextFloat();

        float fuelEfficiency = miles / gallonsOfFuel;

        System.out.println("\nMiles Per Gallon: " + fuelEfficiency);

    }
}
