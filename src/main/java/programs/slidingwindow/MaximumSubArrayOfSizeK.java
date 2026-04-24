package programs.slidingwindow;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int maximumSubArray = getMaximumSubArray(arr, 3);
        System.out.println(maximumSubArray);
    }

    private static int getMaximumSubArray(int[] arr, int k) {
        int windowStart = 0;
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];

            if(windowEnd >= k -1) {
                maxSum = Math.max(maxSum, windowSum);

                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }

        return maxSum;
    }
}
