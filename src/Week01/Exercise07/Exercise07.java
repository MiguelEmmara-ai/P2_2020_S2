package Week01.Exercise07;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours");
        int hours = scanner.nextInt();
        System.out.println("Enter the number of minutes");
        int minutes = scanner.nextInt();
        System.out.println("Enter the number of seconds");
        int seconds = scanner.nextInt();

        int totalSeconds = seconds + (60 * minutes) + (3600 * hours);

        System.out.println("The total number of seconds is " + totalSeconds);
    }
}
