package programs.array;

import java.util.Arrays;

public class RotateArrayOptimalSolution {
    public static void main(String[] args) {
        int[] arr = {10, 30, 15, 40, 35};
        int k = 3;

        //rotateArrayToRight(arr, 3);
        rotateArrayToLeft(arr, 3);
        Arrays.stream(arr)
                .forEach(e -> System.out.print(e + " "));
    }

    private static void rotateArrayToLeft(int[] arr, int k) {
        int len = arr.length;
        k = k % len;

        rotate(arr, 0, k - 1);
        rotate(arr, k, len - 1);
        rotate(arr, 0, len - 1);
    }

    private static void rotateArrayToRight(int[] arr, int k) {
        int len = arr.length;
        k = k % len;

        rotate(arr, 0, len - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, len - 1);
    }

    private static void rotate(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

/*
Optimal Approach (Reversal Algorithm) — O(n), No Extra Space
 */

/*
Right:
Rotate entire array
Rotate first k elements
Rotate remaining elements

Left:
Rotate first k element
Rotate remaining elements
Rotate entire array
 */