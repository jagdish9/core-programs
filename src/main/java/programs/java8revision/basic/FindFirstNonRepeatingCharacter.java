package programs.java8revision.basic;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "HamHara nahi hai!";

        Character output = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(m -> m.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(output);
    }
}
