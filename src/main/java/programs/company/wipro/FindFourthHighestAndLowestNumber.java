package programs.company.wipro;

import java.util.Arrays;
import java.util.Comparator;

public class FindFourthHighestAndLowestNumber {
    public static void main(String[] args) {
        int[] arr = {10, 40, 6, 99, 65, 21, 100, 34, 18, 23, 121, 167, 2};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(3)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);

        Arrays.stream(arr)
                .boxed()
                .sorted()
                .skip(3)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
