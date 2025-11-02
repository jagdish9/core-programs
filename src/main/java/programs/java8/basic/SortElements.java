package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SortElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");

        List<String> output = words.stream()
                .sorted()
                .toList();

        System.out.println(output);
    }
}
