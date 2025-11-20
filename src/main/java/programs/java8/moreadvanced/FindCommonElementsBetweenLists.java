package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsBetweenLists {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> l2 = Arrays.asList(4, 5, 7, 2);

        List<Integer> output = l1.stream()
                .filter(f -> l2.contains(f))
                .toList();

        System.out.println(output);
    }
}
