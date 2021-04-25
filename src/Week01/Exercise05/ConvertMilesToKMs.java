package Week01.Exercise05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertMilesToKMs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MILE_EQUAL = 1.60934;
        boolean stop = true;

        System.out.println("Enter the number of miles:");

        do {
            try {
                float numOfMiles = scanner.nextFloat();
                scanner.nextLine();
                if (numOfMiles < 0) {
                    System.out.println("Please enter a value greater than 0!");
                    stop = true;
                } else {
                    float km = (float) (numOfMiles * MILE_EQUAL);
                    System.out.println("The number of kms is: " + km);
                    stop = false;
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Please enter a number");
                System.err.flush();
                scanner.nextLine();
            }
        } while (stop);
    }
}
