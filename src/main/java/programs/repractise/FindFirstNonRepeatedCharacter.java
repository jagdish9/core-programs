package programs.repractise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";

        Optional<Character> nonRepeatingChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(fv -> fv.getValue() == 1)
                .map(k -> k.getKey())
                .findFirst();

        Optional<Character> nonRepeatingChar2 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(f -> f, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(fv -> fv.getValue() == 1)
                .map(k -> k.getKey())
                .findFirst();

        nonRepeatingChar.ifPresent(System.out::println);
        nonRepeatingChar2.ifPresent(System.out::println);
    }
}
