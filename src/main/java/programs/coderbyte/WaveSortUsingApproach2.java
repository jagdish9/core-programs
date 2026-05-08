package programs.coderbyte;

import java.util.Arrays;
import java.util.Comparator;

public class WaveSortUsingApproach2 {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};

        waveSortUsingApproach2(arr);

        Arrays.stream(arr)
                .forEach(a -> System.out.print(a + " "));
    }

    private static void waveSortUsingApproach2(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
    }
}
/*
Approach 2: Sort + Swap (Simpler but slower)
Steps:
Sort the array
Swap adjacent elements
 */