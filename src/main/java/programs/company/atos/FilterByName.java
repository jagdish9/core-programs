package programs.company.atos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByName {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Jagdish", "Jagannath", "ABC", "XYZ");

        List<String> output = ls.stream()
                .filter(f -> f.startsWith("Jag"))
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
