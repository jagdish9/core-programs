package programs.java8.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordAtSamePlaceAndPreserveSpecialChar {
    public static void main(String[] args) {
        String input = "My, name. is Abc";
        String result = reverseEachWordPreserveSymbols(input);
        System.out.println(result);
    }

    public static String reverseEachWordPreserveSymbols(String str) {
        // Split input by space but keep spaces for reconstruction
        return Arrays.stream(str.split(" ", -1)) // preserve empty splits
                .map(m -> reverseWordPreserveSymbols(m))
                .collect(Collectors.joining(" "));
    }

    private static String reverseWordPreserveSymbols(String word) {
        // Extract letters
        List<Character> letters = word.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.toList());

        // Reverse letters
        Collections.reverse(letters);
        Iterator<Character> it = letters.iterator();

        // Rebuild word, preserving non-letter characters
        return word.chars()
                .mapToObj(c -> (char) c)
                .map(ch -> Character.isLetter(ch) ? it.next() : ch)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
