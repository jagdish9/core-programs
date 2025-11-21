package programs.java8.commonlyasked;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GetOnlyUniqueCharFromString {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Long> output = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        output.forEach((k, v) -> {
            System.out.println(k + " "+ v);
        });

        Set<Character> output2 = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(output2);
    }
}
