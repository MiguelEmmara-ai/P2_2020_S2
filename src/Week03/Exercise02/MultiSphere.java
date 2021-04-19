package Week03.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class MultiSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        do {
            try {
                System.out.print("Enter Sphere Diameter > ");
                int diameter = scanner.nextInt();

                Sphere aSphere = new Sphere(diameter);
                System.out.println(aSphere);
                stop = true;
            } catch (InputMismatchException e) {
                System.out.println("Please Input a valid number");
                scanner.nextLine();
            }
        } while(!stop);

    }
}
