package programs.company.wipro;

import java.util.Arrays;

public class FindSumOfIntArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int result = Arrays.stream(arr)
                .sum();

        System.out.print(result);
    }
}
