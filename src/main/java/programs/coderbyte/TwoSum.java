package programs.coderbyte;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] indexes = findIndexes(arr, target);

        Arrays.stream(indexes)
                .forEach(a -> System.out.print(a + " "));
    }

    private static int[] findIndexes(int[] arr, int target) {
        int[] output = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }
}

/*
Given an array and a target, find two indices such that their values add up to the target.
 */
