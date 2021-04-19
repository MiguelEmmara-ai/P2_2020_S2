package Week01.Exercise08;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        int second = scanner.nextInt();

        int seconds = second % 60;
        int hours = second / 60;
        int minutes = hours % 60;
        hours = hours / 60;

        System.out.println();
        System.out.println(second + " seconds is equivalent to");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
    }
}
