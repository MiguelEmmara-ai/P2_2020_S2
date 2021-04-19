package Week02.Exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class BookInputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book aBook = new Book();
        boolean stop = false;

        System.out.println("Please enter the title of the book");
        aBook.setTitle(scanner.nextLine());

        System.out.println("Please enter the author name");
        aBook.setAuthor(scanner.nextLine());

        System.out.println("Please enter the number of pages");

        do {
            try {
                int numberOfPages = scanner.nextInt();
                scanner.nextLine();

                if (numberOfPages > 0) {
                    aBook.setNumberOfPages(numberOfPages);
                    stop = true;
                } else {
                    System.out.println("Please Enter Value Greater Than 0");
                    stop = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Input a valid number");
                scanner.nextLine();
            }
        } while (!stop);

        System.out.println(aBook);
    }
}
