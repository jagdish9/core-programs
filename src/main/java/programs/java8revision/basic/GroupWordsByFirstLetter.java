package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByFirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "string");

        Map<Character, List<String>> output = words.stream()
                .collect(Collectors.groupingBy(c -> c.charAt(0)));

        System.out.println(output);
    }
}
