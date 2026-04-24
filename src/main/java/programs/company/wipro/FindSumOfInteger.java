package programs.company.wipro;

import java.util.Arrays;
import java.util.List;

public class FindSumOfInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 30, 50, 60, 20);

        int result = list.stream()
                .mapToInt(i -> i)
                .sum();

        System.out.print(result);
    }
}
