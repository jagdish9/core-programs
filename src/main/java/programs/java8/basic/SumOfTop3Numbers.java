package programs.java8.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfTop3Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 40, 60);

        int sumOfTop3Numbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumOfTop3Numbers);
    }
}
