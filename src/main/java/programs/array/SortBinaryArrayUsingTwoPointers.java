package programs.array;

import java.util.Arrays;

public class SortBinaryArrayUsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 1};

        int zeroCount = 0;

        for(int num : arr) {
            if(num == 0) {
                zeroCount++;
            }
        }

        for(int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for(int j = zeroCount; j < arr.length; j++) {
            arr[j] = 1;
        }

        Arrays.stream(arr)
                .boxed()
                .forEach(a -> System.out.print(a + " "));
    }
}
