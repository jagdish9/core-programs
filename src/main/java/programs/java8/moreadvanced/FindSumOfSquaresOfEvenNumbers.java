package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindSumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Optional<Integer> sum = list.stream()
                .filter(f -> f % 2 == 0)
                .map(m -> m * m)
                .reduce(Integer::sum);

        sum.ifPresent(System.out::println);
    }
}
