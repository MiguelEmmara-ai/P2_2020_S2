package Week01.Exercise04;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;

        System.out.println("Please enter the numerator");
        numerator = scanner.nextInt();

        System.out.println("Please enter the denominator");
        denominator = scanner.nextInt();

        System.out.println("The input fraction is: " + numerator + "/" + denominator);

        if (denominator == 0) {
            System.out.println("This quantity is undefined");
        } else {
            float decimalEquiv = (float) (numerator / denominator);
            System.out.println("The decimal equivalence is: " + decimalEquiv);
        }
    }
}
