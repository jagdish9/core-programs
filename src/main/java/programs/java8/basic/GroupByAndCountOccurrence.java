package programs.java8.basic;

import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAndCountOccurrence {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> output = items.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(output);
    }
}
