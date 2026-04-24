package programs.company.wipro;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 60, 40, 70};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
