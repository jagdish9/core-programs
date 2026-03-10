package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 4, 6, 6, 8, 8, 10);
        Set<Integer> output = input.stream()
                .collect(Collectors.toSet());

        System.out.println(output);
    }
}
