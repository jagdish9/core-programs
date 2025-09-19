package programs.array;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int maxSubArray = getMaxSubArray(arr);
        System.out.println(maxSubArray);
    }

    private static int getMaxSubArray(int[] arr) {
        int maxSum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                //maxSum = Math.max(maxSum, sum);
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
