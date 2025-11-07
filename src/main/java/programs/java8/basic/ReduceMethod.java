package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        int min = numbers.stream()
                .reduce(0, (a, b) -> a - b);
        System.out.println(min);
    }
}
