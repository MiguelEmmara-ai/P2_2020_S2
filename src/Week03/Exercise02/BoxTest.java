package Week03.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = 0;
        int width = 0;
        int depth = 0;
        boolean stop = false;

        Box aBox = new Box(0, 0, 0);

        do {
            try {
                System.out.print("Enter Box height: ");
                height = scanner.nextInt();
                aBox.setHeight(height);
                stop = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number");
                scanner.nextLine();
            }
        } while (!stop);

        stop = false;
        do {
            try {
                System.out.print("Enter Box width: ");
                width = scanner.nextInt();
                aBox.setWidth(width);
                stop = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number");
                scanner.nextLine();
            }
        } while (!stop);

        stop = false;
        do {
            try {
                System.out.print("Enter Box depth: ");
                depth = scanner.nextInt();
                aBox.setDepth(depth);
                stop = true;
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number");
                scanner.nextLine();
            }
        } while (!stop);

        stop = false;
        do {
            try {
                System.out.print("Is the box full? (Y/N): ");
                char c = scanner.next().toLowerCase().charAt(0);

                switch (c) {
                    case 'y':
                        aBox.setFull(true);
                        stop = true;
                        break;
                    case 'n':
                        aBox.setFull(false);
                        stop = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please answer (Y/N)");
            }
        } while (!stop);

        System.out.println("\n" + aBox);
    }
}
