package Week06.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        boolean stop = false;

        System.out.println("how many numbers would you like to add to the list?");
        do {
            try {
                System.out.print("> ");
                int n = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < n; i++) {
                    System.out.print(counter + ": ");
                    int number_to_add = scanner.nextInt();
                    numbers.addNumber(number_to_add);
                    counter++;
                }

                stop = true;

            } catch (InputMismatchException e) {
                System.out.println("Please Input Valid Number");
                scanner.nextLine();
            }
        } while (!stop);

        System.out.println("\nPrint List");
        numbers.printList();

        System.out.println("\nMin: " + numbers.min());
        System.out.println("Max: " + numbers.max());

        System.out.println("\nClear the list");
        numbers.clear();
        numbers.printList();
    }
}
