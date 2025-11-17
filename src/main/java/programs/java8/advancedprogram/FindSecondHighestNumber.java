package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,4,3,2,10);

        Optional<Integer> output = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();

        output.ifPresent(System.out::println);
    }
}
