package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.List;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 30, 4, 50);

        int max = list.stream()
                .max((m, n) -> Integer.compare(m, n))
                .get();

        int min = list.stream()
                .min(Integer::compare)
                .get();

        System.out.println(max);
        System.out.println(min);
    }
}
