package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> output = numbers.stream()
                .filter(a -> a % 2 == 0)
                .toList();

        System.out.println(output);
    }
}
