package programs.java8.moreadvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 2);

        Map<String, Integer> output = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        output.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
