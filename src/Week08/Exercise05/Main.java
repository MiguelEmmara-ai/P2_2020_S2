package Week08.Exercise05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Miguel Emmara
 */
public class Main {
    private static final String FILENAME = "./src/Week08/Exercise05/resources/file.txt";

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                arrayList.add(strCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        findLongestWord(arrayList);

    }

    public static void findLongestWord(ArrayList<String> arrayList) {
        String longest = "";
        for (String s : arrayList) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println("Longest word in the text file is: \"" + longest + "\"");
    }
}
