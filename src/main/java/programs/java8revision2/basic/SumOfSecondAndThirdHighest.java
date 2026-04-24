package programs.java8revision2.basic;

import java.util.Arrays;
import java.util.Comparator;

public class SumOfSecondAndThirdHighest {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 8, 7, 5, 6, 13};

        int sum = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(2)
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum);
    }
}
