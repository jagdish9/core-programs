package programs.java8revision.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsByPreservingSpecialChar {
    public static void main(String[] args) {
        String input = "My, name. is Abc";

        String output = Arrays.stream(input.split(" ", -1))
                .map(m -> reverseWord(m))
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }

    private static String reverseWord(String word) {
        List<Character> onlyLetter = word.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> Character.isLetter(f))
                .collect(Collectors.toList());

        Collections.reverse(onlyLetter);

        Iterator<Character> it = onlyLetter.iterator();

        String output = word.chars()
                .mapToObj(m -> (char) m)
                .map(ch -> Character.isLetter(ch) ? it.next() : ch)
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining());

        return output;
    }
}
