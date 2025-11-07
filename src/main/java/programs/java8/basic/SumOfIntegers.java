package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
