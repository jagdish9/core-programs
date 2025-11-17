package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListWithCommaSeparated {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        String output = list.stream()
                .map(m -> String.valueOf(m))
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
