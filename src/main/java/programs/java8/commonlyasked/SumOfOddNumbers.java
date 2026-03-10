package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> output = list.stream()
                .filter(f -> f % 2 != 0)
                .toList();

        System.out.println(output);

        int sum = list.stream()
                .filter(f -> f % 2 != 0)
                .mapToInt(m -> m)
                .sum();
        System.out.print(sum);
    }
}
