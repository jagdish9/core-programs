package programs.java8revision.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 11, 21, 48);

        Optional<Integer> secondHighestNumber = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighestNumber.ifPresent(System.out::println);
    }
}
