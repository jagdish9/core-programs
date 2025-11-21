package programs.java8.commonlyasked;

import java.util.Set;
import java.util.stream.Collectors;

public class FindElementsNotPresentInSecondSet {
    public static void main(String[] args) {
        Set<Integer> set01 = Set.of(10, 20, 40, 60, 8, 23, 45);
        Set<Integer> set02 = Set.of(44, 66, 40, 60, 11, 30, 46, 89);

        Set<Integer> output = set01.stream()
                .filter(f -> !set02.contains(f))
                .collect(Collectors.toSet());

        System.out.println(output);
    }
}
