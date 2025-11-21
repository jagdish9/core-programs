package programs.java8.commonlyasked;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharInsensitive {
    public static void main(String[] args) {
        String input = "programMingM";

        //case sensitive
        Map<Character, Long> output = input.chars()
                .mapToObj(o -> (char) o)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        output.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println();

        //case insensitive
        Map<Character, Long> output2 = input.toLowerCase().chars()
                .mapToObj(o -> (char) o)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        output2.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
