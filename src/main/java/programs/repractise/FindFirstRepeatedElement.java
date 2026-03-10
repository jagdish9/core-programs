package programs.repractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstRepeatedElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,20,40,50);

        Set<Integer> unique = new HashSet<>();

        list.stream()
                .filter(f -> !unique.add(f))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
