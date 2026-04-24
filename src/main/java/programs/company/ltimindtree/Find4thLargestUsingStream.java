package programs.company.ltimindtree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find4thLargestUsingStream {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 40, 12, 78, 35, 30);
        int k = 4;

        Optional<Integer> fourthLargest = ls.stream()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .findFirst();

        fourthLargest.ifPresent(System.out::println);
    }
}
