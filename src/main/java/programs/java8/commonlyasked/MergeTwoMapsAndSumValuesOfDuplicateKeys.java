package programs.java8.commonlyasked;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMapsAndSumValuesOfDuplicateKeys {
    public static void main(String[] args) {
        Map<String, Integer> map01 = Map.of("A", 10, "X", 8, "C", 12, "Z", 18, "W", 13);
        Map<String, Integer> map02 = Map.of("AA", 10, "X", 8, "CC", 12, "Z", 18, "WW", 13);

        Map<String, Integer> output = Stream.concat(map01.entrySet().stream(), map02.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a+b));

        System.out.println(output);
    }
}
