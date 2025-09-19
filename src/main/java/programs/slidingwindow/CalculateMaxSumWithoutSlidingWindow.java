package programs.slidingwindow;

public class CalculateMaxSumWithoutSlidingWindow {

    public static void main(String[] args) {
        int[] arr = {1, 7, 6, 2, 3, 4, 5};
        int k = 2;
        int maxSum = calculateMaxSum(arr, k);
        System.out.println(maxSum);
    }

    private static int calculateMaxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - k; i++) {
            int currSum = 0;
            for(int j = 0; j < k; j++) {
                currSum = currSum + arr[j+i];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
