package Week01.Exercise03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Birthday: ");
        String birthday = scanner.nextLine();

        System.out.print("Interests: ");
        String interest = scanner.nextLine();

        System.out.print("Favorite book: ");
        String favBook = scanner.nextLine();

        System.out.print("Favorite film: ");
        String favFilm = scanner.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Birthday: " + birthday);
        System.out.println("Interests: " + interest);
        System.out.println("Favorite book: " + favBook);
        System.out.println("Favorite film: " + favFilm);
    }
}
