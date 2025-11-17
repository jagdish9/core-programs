package programs.java8.advancedprogram;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {
    public static void main(String[] args) {
        String input = "programming";

        List<Character> output = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(m -> m.getKey())
                .toList();

        Map<Character, Long> output2 = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .collect(Collectors.toMap(m -> m.getKey(), n -> n.getValue()));

        System.out.println(output);
        System.out.println(output2);
    }
}
