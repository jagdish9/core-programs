package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedListAndRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(3, 4, 5);

        List<Integer> output = Stream.concat(l1.stream(), l2.stream())
                .distinct()
                .toList();

        System.out.println(output);
    }
}
