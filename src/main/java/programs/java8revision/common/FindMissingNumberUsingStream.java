package programs.java8revision.common;

import java.util.Arrays;

public class FindMissingNumberUsingStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int arraySum = n * (n + 1) / 2;

        int sum = Arrays.stream(arr).sum();

        System.out.println(arraySum - sum);
    }
}
