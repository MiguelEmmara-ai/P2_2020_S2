package Week03.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Kennel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        String dogName;
        int dogAge = 0;

        System.out.print("Enter Dog name: ");
        dogName = scanner.nextLine();

        do {
            try {
                System.out.print("Enter Dog Age: ");
                dogAge = scanner.nextInt();
                stop = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid age");
                scanner.nextLine();
            }
        } while (!stop);

        Dog aDog = new Dog(dogName, dogAge);

        System.out.println(aDog);
    }
}
