package programs.java8.basic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReserveWordAndPreserveSpecialChar {
    public static void main(String[] args) {
        String input = "My, name. is Abc";

        String output = getReverseWord(input);

        System.out.println(output);
    }

    private static String getReverseWord(String input) {
        List<Character> letterReversed = input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .collect(Collectors.toList());

        Collections.reverse(letterReversed);

        Iterator<Character> it = letterReversed.iterator();

        return input.chars()
                .mapToObj(c -> (char) c)
                .map(character -> Character.isLetter(character) ? it.next() : character)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
