package programs.java8revision.common;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "I am a java developer";

        Map<Character, Long> frequencyOfCharacter = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()));

        frequencyOfCharacter.forEach((k, v) -> {
            System.out.println(k + " : "+ v);
        });

        System.out.println("\nNow Sorted by Key");
        Map<Character, Long> fOfCSorted = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()))
                .entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new));

        fOfCSorted.forEach((k, v) -> {
            System.out.println(k + " : "+ v);
        });

        System.out.println("\nNow Sorted by Value desc");
        Map<Character, Long> fOCsBvD = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> f != ' ')
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (o, n) -> o,
                        LinkedHashMap::new));

        fOCsBvD.forEach((k, v) -> {
            System.out.println(k + " : "+ v);
        });
    }
}
