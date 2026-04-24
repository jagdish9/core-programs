package programs.validate;

public class MaxSumOfThreeDivisibleByThree {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1};
        int maxSum = getMaxSum(arr);
        System.out.println(maxSum);
    }

    private static int getMaxSum(int[] arr) {
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = Integer.MIN_VALUE;
        dp[2] = Integer.MIN_VALUE;

        for(int num : arr) {
            int[] temp = dp.clone();

            for(int r = 0; r < 3; r++) {
                if(dp[r] != Integer.MIN_VALUE) {
                    int newSum = dp[r] + num;
                    int newR = newSum % 3;
                    temp[newR] = Math.max(temp[newR], newSum);
                }
            }

            dp = temp;
        }

        return dp[0];
    }
}
