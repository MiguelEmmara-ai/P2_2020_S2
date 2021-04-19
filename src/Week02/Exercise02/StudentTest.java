package Week02.Exercise02;

import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter student's first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter student's last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter student's ID:");
        String studentID = scanner.nextLine();

        System.out.println("Calling 3 parameter constructor:");
        System.out.println(new Student(firstName, lastName, studentID));

        System.out.println("Calling 2 parameter constructor:");
        System.out.println(new Student(firstName, lastName));

        System.out.println("Calling zero parameter constructor:");
        System.out.println(new Student());
    }
}
