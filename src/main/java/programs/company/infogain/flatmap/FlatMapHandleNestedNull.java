package programs.company.infogain.flatmap;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class FlatMapHandleNestedNull {
    public static void main(String[] args) {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("A", "B", "C"),
                Arrays.asList("D", "E", "F"),
                null,
                Arrays.asList("X", "Y", "Z", null)
        );

        List<String> output = input.stream()
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .toList();

        System.out.println(output);

        List<String> output2 = input.stream()
                .filter(Objects::nonNull)
                .flatMap(f ->
                        f.stream()
                ).toList();

        System.out.println(output2);
    }
}
