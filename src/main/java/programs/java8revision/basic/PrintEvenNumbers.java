package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> output = numbers.stream()
                .filter(f -> f % 2 == 0)
                .toList();

        System.out.println(output);
    }
}
