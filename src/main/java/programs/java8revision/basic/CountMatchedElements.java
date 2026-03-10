package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class CountMatchedElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 3, 2, 30, 12);

        long count = numbers.stream()
                .filter(f -> f % 5 == 0)
                .count();

        System.out.println(count);
    }
}
