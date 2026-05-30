package prog;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String input = "a#b,c$d";
        String output = reverseStringWithoutSpecialSymbols(input);
        System.out.println(output);
    }

    public static String reverseStringWithoutSpecialSymbols(String input) {
        List<Character> characterList = input.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> Character.isLetter(f))
                .collect(Collectors.toList());

        Collections.reverse(characterList);

        Iterator<Character> iterator = characterList.iterator();

        List<Character> finalOutput = input.chars()
                .mapToObj(m -> (char) m)
                .map(c -> Character.isLetter(c) ? iterator.next() : c)
                .collect(Collectors.toList());

        return finalOutput.stream()
                .map(c -> String.valueOf(c))
                .collect(Collectors.joining());
    }
}

/*
how to reverse a string having a alphabets  along with special character without affecting
the position of special chars
eg, a#b,c$d output: d#c,b$a like this
 */
