package programs.slidingwindow;

public class MaximumAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double maxAverageSubArray = getMaxAverageSubArray(nums, k);
        System.out.println(maxAverageSubArray);
    }

    private static double getMaxAverageSubArray(int[] nums, int k) {
        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for(int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[right-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
