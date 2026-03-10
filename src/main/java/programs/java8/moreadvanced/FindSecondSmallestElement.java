package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSecondSmallestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 4, 2, 3);

        Optional<Integer> output = list.stream()
                .sorted()
                .skip(1)
                .findFirst();

        output.ifPresent(System.out::println);
    }
}
