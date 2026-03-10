package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindNthHighestSalary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 18, 90, 34, 25, 7, 9, 87, 77, 22);

        int n = 3;

        Integer output = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst()
                .orElse(null);

        System.out.println(output);
    }
}
