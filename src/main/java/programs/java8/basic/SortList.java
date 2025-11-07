package programs.java8.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 5, 1, 9, 2);

        System.out.println("Print in ascending order");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Print in descending order");
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
