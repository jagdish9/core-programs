package programs.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "string");

        //Group words by their first letter
        Map<Character, List<String>> output = words.stream()
                .collect(Collectors.groupingBy(e -> e.charAt(0)));

        System.out.println(output);
    }
}
