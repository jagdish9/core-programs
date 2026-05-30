package programs.twopointerapproach;

import java.util.Arrays;

public class IndexOfTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 5;

        int[] result = getIndexOfTwoSum2(arr, target);
        Arrays.stream(result)
                .forEach(e -> System.out.print(e + " "));
    }

    private static int[] getIndexOfTwoSum2(int[] arr, int target) {
        int left = 0;

        int[] sumValue = new int[2];

        for(int right = 1; right < arr.length; right++) {
            if(arr[left] + arr[right] == target) {
                sumValue[0] = left;
                sumValue[1] = right;
                break;
            }
            left++;
        }

        return sumValue;
    }

    private static int[] getIndexOfTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int[] sumValue = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                sumValue[0] = left;
                sumValue[1] = right;
                break;
            }

            if(sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return sumValue;
    }
}
