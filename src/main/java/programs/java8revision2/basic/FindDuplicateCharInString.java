package programs.java8revision2.basic;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String str = "anamikai";

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(s -> System.out.println(s + " "));
    }
}
