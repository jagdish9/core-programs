package programs.java8revision2.list;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateElementsFromGivenList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 30, 40, 10, 50, 30);

        Set<Integer> seen = new HashSet<>();

        List<Integer> output = ls.stream()
                .filter(f -> !seen.add(f))
                .collect(Collectors.toList());

        System.out.println(output);
    }
}
