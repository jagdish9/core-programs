package programs.company.wekan;

import java.util.*;

public class RotateArray {
    public static int[] rotateArray(int[] arr, int k) {
        // to be implemented
        /*int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }*/
        int[] output = Arrays.copyOf(arr, arr.length);
        int len = output.length;
        while(k != 0) {
            for(int i = 0; i < len - 1; i++) {
                int tmp = output[i];
                output[i] = output[i+1];
                output[i+1] = tmp;
            }

            k--;
        }

        return output;
    }

    public static int[] rotate(int[] nums, int k) {
        int[] output = Arrays.copyOf(nums, nums.length);
        int n = nums.length;
        if(n != 0) {
            k = k % n;
            reverse(output, 0, n - 1);
            reverse(output, 0, k - 1);
            reverse(output, k, n - 1);
        }

        return output;
    }

    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void test(int[] arr, int k, int[] expected) {
        int[] original = (arr == null) ? null : Arrays.copyOf(arr, arr.length);
        int[] actual = rotateArray(arr, k);

        boolean correct = Arrays.equals(actual, expected);
        boolean unmodified = Arrays.equals(arr, original);

        System.out.println(
                ((correct && unmodified) ? "PASS" : "FAIL") +
                        " | rotateArray(" + Arrays.toString(arr) + ", " + k + ")" +
                        " => " + Arrays.toString(actual) +
                        " | expected: " + Arrays.toString(expected) +
                        " | inputUnmodified: " + unmodified
        );
    }

    public static void main(String[] args) {
        // required behavior
        test(new int[]{1,2,3,4,5}, 1, new int[]{2,3,4,5,1});
        test(new int[]{1,2,3,4,5}, 2, new int[]{3,4,5,1,2});
        test(new int[]{1,2,3,4,5}, 3, new int[]{4,5,1,2,3});
        test(new int[]{1,2,3,4,5}, 0, new int[]{1,2,3,4,5});
        test(new int[]{1,2,3,4,5}, 5, new int[]{1,2,3,4,5});
        test(new int[]{1,2,3,4,5}, 7, new int[]{3,4,5,1,2});
        test(new int[]{9}, 3, new int[]{9});
        test(new int[]{}, 2, new int[]{});
    }
}
