package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15, -8);

        int max = numbers.stream()
                .max(Integer::compare).get();
        int min = numbers.stream()
                .min(Integer::compare).get();

        System.out.println(max);
        System.out.println(min);
    }
}
