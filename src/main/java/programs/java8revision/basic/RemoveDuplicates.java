package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> output = numbers.stream()
                .distinct()
                .toList();

        System.out.println(output);
    }
}
