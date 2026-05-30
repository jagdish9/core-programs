package programs.twopointerapproach;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int[] result = getTwoSum(arr, target);
        Arrays.stream(result)
                .forEach(e -> System.out.print(e + " "));
    }

    private static int[] getTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int[] sumValue = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                sumValue[0] = arr[left];
                sumValue[1] = arr[right];
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
