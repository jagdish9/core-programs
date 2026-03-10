package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15, -8);

        numbers.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);

        numbers.stream()
                .min(Integer::compare)
                .ifPresent(System.out::println);
    }
}
