package programs.java8.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOf2ndAnd3rdHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 50, 20, 80, 40, 60);

        int sumOf2ndAnd3rd = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumOf2ndAnd3rd);
    }
}
