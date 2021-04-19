package Week03.Exercise03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class CoinChangerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        do {
            System.out.println("Welcome to the Coin Changer Machine. Please input your coins:");

            try {
                System.out.println("Number of 10c coins:");
                int tens = scanner.nextInt();

                System.out.println("Number of 20c coins:");
                int twenty = scanner.nextInt();

                System.out.println("Number of 50c coins:");
                int fifty = scanner.nextInt();

                System.out.println("Number of  dollar coins:");
                int oneDollar = scanner.nextInt();

                System.out.println("Number of two dollar coins:");
                int twoDollar = scanner.nextInt();

                CoinChanger coinChanger = new CoinChanger(tens, twenty, fifty, oneDollar, twoDollar);
                System.out.println(coinChanger);

                boolean skip = false;
                do {
                    try {
                        System.out.println("Would you like to continue? (Y/N)");
                        char c = scanner.next().toLowerCase().charAt(0);

                        switch (c) {
                            case 'y':
                                skip = true;
                                break;
                            case 'n':
                                stop = true;
                                skip = true;
                                break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Please answer (Y/N)");
                    }
                } while (!skip);

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number\n");
                scanner.nextLine();
            }
        } while (!stop);
    }
}