package programs.repractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
