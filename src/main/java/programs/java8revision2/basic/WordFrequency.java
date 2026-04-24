package programs.java8revision2.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java stream API makes coding with collections powerful and more powerful and easy";

        //char frequency
        Map<Character, Long> charFrequency = sentence.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        charFrequency.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        //word frequency
        Map<String, Long> wordFrequency = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        wordFrequency.forEach((k, v) ->
                System.out.println(k + " " + v));
    }
}
