package programs.repractise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1,2,3,4,5,6,3,7,2);

        Set<Integer> unique = new HashSet<>();

        List<Integer> duplicate = ls.stream()
                .filter(f -> !unique.add(f))
                .toList();

        System.out.println(duplicate);
    }
}
