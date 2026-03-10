package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class FilterNameAndConvertToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "doe", "jane", "smith", "henry");

        List<String> output = names.stream()
                .filter(n -> n.startsWith("j"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
