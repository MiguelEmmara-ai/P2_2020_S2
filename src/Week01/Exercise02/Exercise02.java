package Week01.Exercise02;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();

        float average = (float) (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("\nThe average of the numbers is: " + average);

    }
}
