package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValuesFromList {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("A", null, "B", null, "C", "D", null);

        List<String> output = input.stream()
                //.filter(f -> f != null)
                .filter(Objects::nonNull)
                .toList();

        System.out.println(output);
    }
}
