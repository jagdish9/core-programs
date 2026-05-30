package programs.java8revision.stringprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringWhilePreservingSpecialCharacters {
    public static void main(String[] args) {
        String input = "java, @programming, language!";
        String output = reverseString(input);
        System.out.println(output);
    }

    public static String reverseString(String input) {
        List<Character> characterList = input.chars()
                .mapToObj(c -> (char) c)
                .filter(character -> Character.isLetter(character))
                .collect(Collectors.toList());

        Collections.reverse(characterList);

        Iterator<Character> iterator = characterList.iterator();

        List<Character> finalOutput = input.chars()
                .mapToObj(c -> (char) c)
                .map(character -> Character.isLetter(character) ? iterator.next() : character)
                .collect(Collectors.toList());

        return finalOutput.stream()
                .map(c -> String.valueOf(c))
                .collect(Collectors.joining());
    }
}
