package programs.java8.strqustn;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "javaprogramming";

        Map<Character, Long> output = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        output.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
