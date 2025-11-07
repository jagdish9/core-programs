package programs.java8.basic;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyAndSortByCount {
    public static void main(String[] args) {
        String sentence = "Java stream API makes coding with collections powerful and more powerful and easy";

        Map<Character, Long> output = sentence.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch != ' ') //ignore spaces
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> sortedMap = output.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedMap.forEach((ch, count) -> {
            System.out.println(ch + ": "+count);
        });
    }
}

//() -> new LinkedHashMap<>() = LinkedHashMap::new
