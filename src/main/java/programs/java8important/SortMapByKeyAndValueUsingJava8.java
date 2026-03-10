package programs.java8important;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortMapByKeyAndValueUsingJava8 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("Z", "Yash", "A", "Ajay",
                "B", "Bijay",
                "C", "Chahal",
                "D", "Dada",
                "E", "Sanjay",
                "F", "Anaya",
                "G", "Champa");

        Optional<String> empNameByKey = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(empNameByKey.get());

        Optional<String> empNameByValue = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue)
                .findFirst();

        empNameByValue.ifPresent(f -> System.out.println(f));

        Optional<String> empNameByValueReversed = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getValue)
                .findFirst();

        empNameByValueReversed.ifPresent(System.out::println);

        Map<String, String> sortedMapByValueDesc = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        () -> new LinkedHashMap<>()
                ));

        System.out.println(sortedMapByValueDesc);
    }
}
