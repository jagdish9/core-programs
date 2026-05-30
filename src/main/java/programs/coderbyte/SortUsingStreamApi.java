package programs.coderbyte;

import java.util.Arrays;

public class SortUsingStreamApi {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};

        Arrays.stream(arr)
                .boxed()
                .sorted()
                .forEach(a -> System.out.print(a + " "));
    }
}
