package Week02.Exercise04;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Person {
    int age;
    double weight;
    boolean student;
    char gender;

    public Person(int age, double weight, boolean student, char gender) {
        this.age = age;
        this.weight = weight;
        this.student = student;
        this.gender = gender;
    }

    public Person() {
        this.age = 20;
        this.weight = 70;
        this.student = true;
        this.gender = 'M';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the person’s age:");
        int age = scanner.nextInt();

        System.out.println("Please enter the person’s weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Is the person a student (true/false):");
        String student = scanner.nextLine();

        System.out.println("Please enter the person’s gender (M/F):");
        char gender = scanner.next().charAt(0);

        Person person;
        if (student.equalsIgnoreCase("true")) {
            person = new Person(age, weight, true, gender);

        } else {
            person = new Person(age, weight, false, gender);
        }
        System.out.println("Person: age: " + person.age + " weight: " + person.weight + " retired: "
                + person.student + " gender: " + person.gender);

    }
}
