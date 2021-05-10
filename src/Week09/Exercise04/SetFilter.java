package Week09.Exercise04;

import java.util.HashSet;

/**
 * Created by Miguel Emmara
 */
public class SetFilter {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();

        words.add("abc");
        words.add("defgabc123");
        words.add("qwerty");

        HashSet<String> filterWords = filter(words,"abc");

        System.out.println(filterWords);
    }

    private static HashSet<String> filter(HashSet<String> words, String str) {
        HashSet<String> filterWords = new HashSet<>();

        for (String set : words) {
            if (set.contains(str)) {
                filterWords.add(set);
            }
        }

        return filterWords;
    }
}
