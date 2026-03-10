package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("jagdish", "kumar", "java");

        List<String> output = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
