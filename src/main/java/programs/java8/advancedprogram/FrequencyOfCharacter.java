package programs.java8.advancedprogram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String input = "banana";

        Map<Character, Long> output = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println(k + " "+ v);
        });
    }
}
