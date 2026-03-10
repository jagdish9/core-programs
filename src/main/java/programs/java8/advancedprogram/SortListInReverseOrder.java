package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 4, 3, 2);

        List<Integer> output = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(output);
    }
}
