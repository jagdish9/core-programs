package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCharFromListOfStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "ball");

        Set<Character> output = list.stream()
                .flatMap(c -> c.chars().mapToObj(m -> (char) m))
                .collect(Collectors.toSet());

        System.out.println(output);
    }
}
