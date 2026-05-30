package programs.company.aziro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringAtSamePlace {
    public static void main(String[] args) {
        String str = "java programming language";

        List<String> input = Arrays.asList(str.split(" "));
        String output = input.stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
