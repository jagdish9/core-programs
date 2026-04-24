package programs.array;

import java.util.Arrays;

public class RotateArrayByKPosition {
    public static void main(String[] args) {
        int[] arr = {10, 30, 15, 40, 35};
        int k = 3;

        //int[] output = rotateArrayByKPosition(arr, k);

        int[] output = rotateArrayRightByKPositionUsingBruteForce(arr, k);

        Arrays.stream(output)
                .forEach(d -> System.out.print(d + " "));

    }

    private static int[] rotateArrayByKPosition(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        for(int i = 0; i < k; i++) {
            int last = arr[n - 1];

            for(int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[0] = last;
        }

        return arr;
    }

    //Brute Force (Rotate One by One) — O(n*k)
    private static int[] rotateArrayLeftByKPositionUsingBruteForce(int[] arr, int k) {
        k = k % arr.length;
        while(k != 0) {
            for(int i = 0; i < arr.length - 1; i++) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            k--;
        }

        return arr;
    }

    private static int[] rotateArrayRightByKPositionUsingBruteForce(int[] arr, int k) {
        int len = arr.length;
        k = k % len;
        while(k != 0) {
            for(int i = len - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
            k--;
        }

        return arr;
    }
}
