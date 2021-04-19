package Week01.Exercise01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the message?");
        String message = scanner.nextLine();

        System.out.println("\nThe message is \"" + message + "\".");
    }

}
