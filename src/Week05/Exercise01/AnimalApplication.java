package Week05.Exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class AnimalApplication {
    private static final Animal[] animals = new Animal[4];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice;
        int counter = 0;
        boolean stop = false;
        Dog dog;
        Cat cat;

        do {
            try {
                while (counter < animals.length) {
                    System.out.println("Type 1 to create a Dog Object or 2 to create a Cat object");
                    userChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (userChoice) {
                        case 1:
                            dog = new Dog();
                            animals[counter] = dog;
                            counter++;
                            break;
                        case 2:
                            cat = new Cat();
                            animals[counter] = cat;
                            counter++;
                            break;
                        default:
                            System.out.println("Enter 1 or 2");
                            break;
                    }
                }

                stop = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        } while (!stop);

        stop = false;
        do {
            try {
                System.out.println("Select an animal to feed by entering a number within the range: 0 to 4 (4 to quit)");
                for (int i = 0; i < animals.length; i++) {
                    System.out.println(i + " " + animals[i].toString());
                }
                userChoice = scanner.nextInt();
                scanner.nextLine();

                switch (userChoice) {
                    case 0:
                        animals[0].feed();
                        break;
                    case 1:
                        animals[1].feed();
                        break;
                    case 2:
                        animals[2].feed();
                        break;
                    case 3:
                        animals[3].feed();
                        break;
                    case 4:
                        System.out.println("Input out of range, quitting.");
                        stop = true;
                        break;

                    default:
                        System.out.println("Enter 1 - 4 (4 to quit)");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        } while (!stop);
    }
}