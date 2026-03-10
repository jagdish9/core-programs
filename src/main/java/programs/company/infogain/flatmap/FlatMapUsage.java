package programs.company.infogain.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapUsage {
    public static void main(String[] args) {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("A", "B", "C"),
                Arrays.asList("D", "E", "F"),
                Arrays.asList("X", "Y", "Z")
        );

        List<String> output = input.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(output);
    }
}
