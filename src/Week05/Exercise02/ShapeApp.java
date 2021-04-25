package Week05.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class ShapeApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice;
        boolean stop = false;

        do {
            try {
                System.out.println("1 Create a Circle Object\n" +
                        "2 Create a Rectangle object\n" +
                        "3 Stop");
                System.out.print("\nAnswer > ");
                userChoice = scanner.nextInt();
                scanner.nextLine();

                switch (userChoice) {
                    case 1:
                        System.out.print("Enter Radius: ");
                        int radius = scanner.nextInt();
                        scanner.nextLine();
                        Circle circle = new Circle(radius);
                        System.out.println("The area of the circle is: " + circle.computeArea() + "\n");
                        break;

                    case 2:
                        System.out.print("Enter Length: ");
                        int length = scanner.nextInt();

                        System.out.print("Enter Width: ");
                        int width = scanner.nextInt();

                        scanner.nextLine();
                        Rectangle rectangle = new Rectangle(length, width);
                        System.out.println("The area of the rectangle is: " + rectangle.computeArea() + "\n");
                        break;

                    case 3:
                        stop = true;
                        break;

                    default:
                        System.out.println("\nEnter 1 - 3\n");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("\nEnter 1 - 3\n");
                scanner.nextLine();
            }
        } while (!stop);
    }
}
