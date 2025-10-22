package programs.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateResults = new HashSet<>();

        List<String> result = listOfLists.stream()
                .flatMap(List::stream)
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(x -> intermediateResults.add(x))
                .collect(Collectors.toList());

        System.out.println("Intermediate Results");
        intermediateResults.forEach(System.out::println);

        System.out.println();

        System.out.println("Final result");
        result.forEach(System.out::println);
    }
}
