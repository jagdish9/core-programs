package programs.java8.basic;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String sentence = "Java stream API makes coding with collections powerful and more powerful and easy";

        Map<Character, Long> output = sentence.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch != ' ') //ignore spaces
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        output.forEach((ch, count) -> {
            System.out.println(ch + ": "+count);
        });
    }
}
