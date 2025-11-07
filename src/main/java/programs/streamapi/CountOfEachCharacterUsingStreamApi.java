package programs.streamapi;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterUsingStreamApi {
    public static void main(String[] args) {
        String s = "javaprogrammer";

        Map<String, Long> output = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        output.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
