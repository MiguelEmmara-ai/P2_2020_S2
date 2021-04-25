package Week01.Exercise09;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the temperature in Fahrenheit:");
        int fahrenheit = scanner.nextInt();

        // (°F − 32) × 5/9 = °C
        int celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("The temperature " + fahrenheit + "F is " + celsius + "C");
    }
}
