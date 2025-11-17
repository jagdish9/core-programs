package programs.java8.advancedprogram;

import java.util.List;
import java.util.stream.Stream;

public class StringStartsWithSpecificLetter {
    public static void main(String[] args) {

        List<String> output = Stream.of("aa", "abc", "bb", "ac")
                .filter(f -> f.startsWith("a"))
                .toList();

        long total = Stream.of("aa", "abc", "bb", "ac")
                .filter(f -> f.startsWith("a"))
                        .count();

        System.out.println(output);
        System.out.println(total);
    }
}
