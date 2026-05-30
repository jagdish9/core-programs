package programs.twopointerapproach;

public class MaximumSubArrayOfSizeKUsingSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = getMaximumSubArrayOfSizeKUsingSlidingWindow(arr, k);
        System.out.println(result);
    }

    private static int getMaximumSubArrayOfSizeKUsingSlidingWindow(int[] arr, int k) {
        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for(int left = k; left < arr.length; left++) {
            windowSum = windowSum + arr[left] - arr[left - k];

            if(windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
}

/*
2+1+5 = 8
8+1-2 = 7

 */