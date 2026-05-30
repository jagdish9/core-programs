package programs.company.ustglobal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfChar {
    public static void main(String[] args) {

        String str = "Java, programming, @language";

        Map<String, Long> output = str.chars()
                .mapToObj(c -> (char) c)
                .filter(f -> Character.isLetter(f))
                .map(m -> String.valueOf(m).toLowerCase())
                .collect(Collectors.groupingBy(b -> b, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (o, n) -> o, LinkedHashMap::new));

        output.forEach((k, v) -> {
            System.out.println(k + ": "+v);
        });
    }
}