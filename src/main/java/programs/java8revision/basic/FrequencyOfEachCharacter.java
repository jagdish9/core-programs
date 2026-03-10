package programs.java8revision.basic;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String input = "banana";

        Map<Character, Long> output = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(output);
    }
}
