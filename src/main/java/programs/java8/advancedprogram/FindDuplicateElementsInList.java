package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,4,5);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = list.stream()
                .filter(f -> !seen.add(f))
                .toList();

        System.out.println(duplicates);
    }
}
