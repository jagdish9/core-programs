package programs.java8revision.stringprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringAtSamePlaceWhilePreservingSpecialCharacters {
    public static void main(String[] args) {
        String input = "java, @programming, language!";
        String output = reverseStringAtSamePlace(input);
        System.out.println(output);
    }

    private static String reverseStringAtSamePlace(String input) {
        List<String> inputList = Arrays.asList(input.split(" "));

        return inputList.stream()
                .map(s -> {
                    List<Character> characterList = s.chars()
                            .mapToObj(c -> (char) c)
                            .filter(f -> Character.isLetter(f))
                            .collect(Collectors.toList());
                    Collections.reverse(characterList);

                    Iterator<Character> iterator = characterList.iterator();

                    List<Character> finalOutput = s.chars()
                            .mapToObj(c -> (char) c)
                            .map(m -> Character.isLetter(m) ? iterator.next() : m)
                            .collect(Collectors.toList());

                    return finalOutput.stream()
                            .map(g -> String.valueOf(g))
                            .collect(Collectors.joining());
                })
                .collect(Collectors.joining(" "));
    }
}
