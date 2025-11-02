package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class ChainOperation {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "doe", "jane", "smith");

        //Filter names starting with 'j' and convert to uppercase and collect
        List<String> output = names.stream()
                .filter(e -> e.startsWith("j"))
                .map(m -> m.toUpperCase())
                .toList();

        System.out.println(output);
    }
}
