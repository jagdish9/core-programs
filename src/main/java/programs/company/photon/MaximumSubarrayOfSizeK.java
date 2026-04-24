package programs.company.photon;

public class MaximumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = getMaximumSum(arr, k);
        System.out.println(maxSum);
    }

    private static int getMaximumSum(int[] arr, int k) {
        int maxSum = 0;
        for(int i = 0; i < arr.length - k; i++) {
            int tmpSum = 0;
            for(int j = i; j < k+i; j++) {
                tmpSum += arr[j];
            }
            maxSum = Math.max(maxSum, tmpSum);
        }
        return maxSum;
    }
}

/*
Complexity: O(n^2)

Need to optimize with Sliding window
 */
