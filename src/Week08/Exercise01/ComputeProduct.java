package Week08.Exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class ComputeProduct {
    private static Scanner scanner;

    public static void product() throws InputMismatchException {
        boolean stop = false;
        System.out.println("Welcome to the calculator.");

        do {
            try {
                System.out.println("1. Compute product\n" +
                        "2. quit");
                int user_input = scanner.nextInt();

                switch (user_input) {
                    case 1:
                        System.out.println("Enter first number:");
                        int value1 = scanner.nextInt();
                        System.out.println("Enter second number:");

                        int value2 = scanner.nextInt();
                        System.out.println("Product is: " + (value1 * value2));
                        break;

                    case 2:
                        System.out.println("Goodbye!");
                        stop = true;
                        break;

                    default:
                        System.err.println("Invalid menu input. Please try again.");
                        scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.err.println("Error reading integer value");
                scanner.nextLine();
            }
        } while (!stop);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        product();
    }
}