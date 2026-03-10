package programs.repractise;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character, Long> countOfEachChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(uc -> uc, Collectors.counting()));

        countOfEachChar.forEach((k, v) -> {
            System.out.println(k + " : "+ v);
        });

        System.out.println("--------------");

        String str2 = "I am a java jDeveloper";
        Map<Character, Long> countOfEachChar2 = str2.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(uc -> uc, Collectors.counting()));

        countOfEachChar2.forEach((k, v) -> {
            System.out.println(k + " : "+ v);
        });
    }
}
