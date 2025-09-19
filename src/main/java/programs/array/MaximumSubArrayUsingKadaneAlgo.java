package programs.array;

public class MaximumSubArrayUsingKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int maxSubArray = getMaxSubArrayUsingKadaneAlgo(arr);
        System.out.println(maxSubArray);
    }

    private static int getMaxSubArrayUsingKadaneAlgo(int[] arr) {
        int maxSum = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            maxSum = Math.max(maxEnding, maxSum);
        }

        return maxSum;
    }
}
