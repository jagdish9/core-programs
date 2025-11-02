package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12, 15);

        int sum = numbers.stream()
                .mapToInt(value -> value.intValue())
                .sum();

        System.out.println(sum);
    }
}
