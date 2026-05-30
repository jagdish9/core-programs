package programs.array;

import java.util.Arrays;

public class SortBinaryArrayUsingBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 1};

        //brute force approach
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        Arrays.stream(arr)
                .boxed()
                .forEach(a -> System.out.print(a + " "));
    }
}
