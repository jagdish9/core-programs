package programs.java8revision2.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindSumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 23, 50, 17, 33);

        int sum = list.stream()
                .filter(f -> f % 2 == 0)
                .mapToInt(i -> i)
                .sum();

        int sum2 = IntStream.rangeClosed(1, 20)
                .filter(f -> f % 2 == 0)
                .sum();

        System.out.println(sum);
        System.out.println(sum2);
    }
}
