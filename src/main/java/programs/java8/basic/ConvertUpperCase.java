package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> output = names.stream()
                //.map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
