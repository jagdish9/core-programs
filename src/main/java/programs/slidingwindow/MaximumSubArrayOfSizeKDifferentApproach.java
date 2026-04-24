package programs.slidingwindow;

public class MaximumSubArrayOfSizeKDifferentApproach {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int maxSubArrayCount = calculateMaxSubArray(arr, k);
        System.out.println(maxSubArrayCount);
    }

    private static int calculateMaxSubArray(int[] arr, int k) {
        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for(int right = k; right < arr.length; right++) {
            windowSum += arr[right];
            windowSum -= arr[right-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
