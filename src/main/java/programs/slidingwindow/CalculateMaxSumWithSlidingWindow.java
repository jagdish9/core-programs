package programs.slidingwindow;

public class CalculateMaxSumWithSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 2, 3, 4, 5};
        int k = 2;
        int maxSum = calculateMaxSumUsingSlidingWindow(arr, k);
        System.out.println(maxSum);
    }

    private static int calculateMaxSumUsingSlidingWindow(int[] arr, int k) {
        int currSum = 0;
        for(int i = 0; i < k; i++) {
            currSum = currSum + arr[i];
        }

        int maxSum = currSum;

        for(int i = k; i < arr.length - k; i++) {
            currSum = currSum - arr[i - k];
            currSum = currSum + arr[i];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
