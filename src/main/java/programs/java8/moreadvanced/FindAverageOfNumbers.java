package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        double output = numbers.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0);

        System.out.println(output);
    }
}
