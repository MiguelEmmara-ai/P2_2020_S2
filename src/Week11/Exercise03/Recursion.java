package Week11.Exercise03;

import java.util.Arrays;

/**
 * Created by Miguel Emmara
 */
public class Recursion {
    public static String plusString(String in) {
        if (in.length() <= 1) {
            return in;
        } else {
            return in.charAt(0) + (in.charAt(0) == in.charAt(1) ? "+" : "") + plusString(in.substring(1));
        }
    }

    public static int multiply(int base, int power) {
        if (power != 0) {
            // Uses recursion to perform multiplication with itself (according to power - 1 times).
            return (base * multiply(base, power - 1));
        } else {
            // Base case.
            return 1;
        }
    }

    public static String reverse(String in) {
        // If string is empty...
        if (in.trim().isEmpty()) {
            // Returns the irreversible String.
            return in;
        }

        // Uses the stack to return characters back-front.
        return reverse(in.substring(1)) + in.charAt(0);
    }

    public static Boolean isPal(String in) {
        if (in.length() == 0 || in.length() == 1) {
            // Returns true for a Strings <= 1 character.
            return true;
        } else if (in.charAt(0) == in.charAt(in.length() - 1)) {
            // Recalls itself to check if next first/last
            // letters are identical (If string is longer than 1 character).
            return isPal(in.substring(1, in.length() - 1));
        }

        // Returns false if there is a mismatched pair.
        return false;
    }

    public static Boolean contains(String in, char ch) {
        if (in == null || in.trim().equals("")) {
            // Base case: Return false to caller if no more string to search.
            return false;
        } else if (ch == in.charAt(0)) {
            // Checks if character matches the next character.
            return true;
        } else {
            // Calls on itself to check for potential matches if
            // the previous character did not match.
            return contains(in.substring(1), ch);
        }
    }

    public static Boolean alphaContains(String in, char ch) {
        if (in.trim().length() == 0) {
            return false;
        } else if (in.length() == 1) {
            return (ch == in.charAt(0));
        } else {
            int midIndex = ((in.length() % 2 == 0) ? ((in.length() / 2) - 1) : (in.length() / 2));

            // A feeble attempt at trying to split the string in half
            // then call the Recursion.contains method to find if character is present
            // in the String.
            if (ch == in.charAt(midIndex)) {
                return true;
            } else {
                return (ch > in.charAt(midIndex) ? alphaContains(in.substring(midIndex + 1), ch) : alphaContains(in.substring(0, midIndex), ch));
            }
        }
    }

    public static void main(String[] args) {
        // Plus string method test.
        System.out.println("Plus Str: " + Recursion.plusString("Hello bunny rabbit!!!!"));

        // Multiply method test.
        int base = 2;
        int power = 3;
        System.out.println("Power Function: " + base + "^" + power + " = " + Recursion.multiply(base, power));

        // Reverse method test.
        System.out.println("Reversed: " + Recursion.reverse("Hello bunny rabbit!!!!"));

        // Palindrome method test.
        String palindrome = "racecar";
        System.out.println("Is \"" + palindrome + "\" a palindrome? " + (Recursion.isPal(palindrome) ? "Yes" : "No"));

        // Contains method test.
        String word = "Amos";
        char character = 'm';
        System.out.println("\"" + word + "\" contains '" + character + "'? " + (Recursion.contains(word, character) ? "Yes" : "No"));

        // Alpha Contains method test.
        String word1 = "efghabdc";
        char[] wordCharArr = word1.toCharArray();
        Arrays.sort(wordCharArr);
        word1 = new String(wordCharArr);
        char character1 = 'c';
        System.out.println("\"" + word1 + "\" contains '" + character1 + "'? " + (Recursion.alphaContains(word1, character1) ? "Yes" : "No"));
    }
}
