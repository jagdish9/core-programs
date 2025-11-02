package programs.java8.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatListOfLists {
    public static void main(String[] args) {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );

        List<String> output = nested.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(output);
    }
}
