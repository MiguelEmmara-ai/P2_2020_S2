package Week02.Exercise04;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class FareDiscountApp {

    public static int calculateDiscount(Person person) {
        int discount = 0;

        if (person.age >= 65) {
            discount = 100;
        } else if (person.student && person.age >= 10 && person.age <= 20) {
            discount = 50;
        } else if (person.student && person.age >= 40 && person.gender == 'F') {
            discount = 75;
        } else if (person.age % 2 == 0) {
            discount = 25;
        } else if (person.age % 2 != 0) {
            discount = 15;
        }
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the person's age:");
        int age = scanner.nextInt();

        System.out.println("Please enter the person's weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Is the person a student? (true/false):");
        String student = scanner.nextLine();
        boolean isStudent = student.equalsIgnoreCase("true");

        System.out.println("Please enter the person's gender:");
        char gender = scanner.next().charAt(0);

        Person person = new Person(age, weight, isStudent, gender);

        System.out.println("Person: age: " + person.age + " weight: " + person.weight + " student? "
                + person.student + " gender: " + person.gender);

        System.out.println("This person's discount is: " + calculateDiscount(person) + "%");

    }
}
