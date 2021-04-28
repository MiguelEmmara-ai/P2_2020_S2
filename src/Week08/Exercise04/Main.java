package Week08.Exercise04;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Miguel Emmara
 */
public class Main {
    private static final String FILENAME = "./src/Week08/Exercise04/resources/file.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String strCurrentLine;

            System.out.println("Current texts in the file");
            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\nEnter Text to append: ");
        String append_text = scanner.nextLine();

        try (FileWriter fw = new FileWriter(FILENAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            // Add text to the file
            out.println(append_text);
            System.out.println("Success Appending to " + FILENAME);

        } catch (IOException e) {
            System.err.println("Error Occurred!");
            scanner.nextLine();
        }
    }
}