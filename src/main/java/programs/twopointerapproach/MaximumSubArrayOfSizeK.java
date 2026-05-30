package programs.twopointerapproach;

public class MaximumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        //int result = getMaximumSubArrayOfSizeKBacktrackProcess(arr, k);
        int result = getMaximumSubArrayOfSizeKForwardProcess(arr, k);
        System.out.println(result);
    }

    private static int getMaximumSubArrayOfSizeKForwardProcess(int[] arr, int k) {
        int maxSum = 0;
        int j = 2;

        for(int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            int l = i;
            while(l <= j) {
                sum += arr[l];
                l++;
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
            j++;
        }

        return maxSum;
    }

    private static int getMaximumSubArrayOfSizeKBacktrackProcess(int[] arr, int k) {
        int maxSum = 0;
        int j = 0;
        for(int i = k-1; i < arr.length; i++) {
            int l = i;
            int sum = 0;
            while(l >= j) {
                sum += arr[l];
                l--;
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
            j++;
        }

        return maxSum;
    }
}
