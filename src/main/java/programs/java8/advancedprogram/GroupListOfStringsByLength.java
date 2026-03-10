package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfStringsByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("java", "python", "go", "c", "bawa");

        Map<Integer, Long> output = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println(k + " "+ v);
        });

        Map<Integer, List<String>> output2 = names.stream()
                .collect(Collectors.groupingBy(x -> x.length()));

        output2.forEach((k, v) -> {
            System.out.println(k + ": "+v);
        });
    }
}
