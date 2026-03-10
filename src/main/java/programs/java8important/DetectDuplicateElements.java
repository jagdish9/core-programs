package programs.java8important;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetectDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 20, 40, 60, 50, 30, 70, 80, 60, 90);

        Set<Integer> seen = new HashSet<>();

        List<Integer> outputBySet = numbers.stream()
                .filter(f -> !seen.add(f))
                .toList();

        System.out.println(outputBySet);

        List<Integer> outputByCollector = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(m -> m.getKey())
                .toList();

        System.out.println(outputByCollector);
    }
}
