package programs.java8revision.basic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByAndCountOccurrence {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> output = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> sortByValue = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                .collect(Collectors.toMap(
                                                        Map.Entry::getKey,
                                                        Map.Entry::getValue,
                                                        (e1, e2) -> e1,
                                                        () -> new LinkedHashMap<>()
                                                ));


        System.out.println(output);

        sortByValue.forEach((k, v) -> {
            System.out.println(k + ": "+ v);
        });
    }
}
