package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2, 4, 6, 8, 9);

        List<Integer> output = ls.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(output);

        int sum = ls.parallelStream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(sum);
    }
}
