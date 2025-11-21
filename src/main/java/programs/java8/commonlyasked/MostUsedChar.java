package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MostUsedChar {
    public static void main(String[] args) {
        String input = "java g is a gg programming language";

        Character output = Arrays.stream(input.split(" "))
                .collect(Collectors.joining())
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(output);
    }
}
