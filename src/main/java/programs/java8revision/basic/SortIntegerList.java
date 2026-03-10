package programs.java8revision.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 5, 1, 9, 2);

        List<Integer> output = numbers.stream()
                .sorted()
                .toList();

        System.out.println(output);

        List<Integer> output2 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(output2);
    }
}
