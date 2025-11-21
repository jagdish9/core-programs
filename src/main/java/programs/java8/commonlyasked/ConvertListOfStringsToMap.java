package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfStringsToMap {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("java", "program", "interface", "king");

        Map<String, Integer> output = input.stream()
                .collect(Collectors.toMap(c -> c, s -> s.length()));

        System.out.println(output);
    }
}
