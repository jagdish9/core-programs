package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class ReverseSortingWithCustomComparator {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 8, 1, 2, 9, 12, 14, 7);

        //sort by asc order
        List<Integer> output = input.stream()
                .sorted((a, b) -> a.compareTo(b))
                .toList();

        System.out.println(output);

        List<Integer> output2 = input.stream()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        System.out.println(output2);
    }
}
