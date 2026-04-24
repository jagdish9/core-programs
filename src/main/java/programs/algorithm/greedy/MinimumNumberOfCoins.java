package programs.algorithm.greedy;

import java.util.Arrays;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int[] coins = {5, 2, 10, 1};
        int amount = 39;

        int minimumCoin = getMinimumNoOfCoin(coins, amount);
        System.out.println(minimumCoin);
    }

    private static int getMinimumNoOfCoin(int[] coins, int amount) {
        Arrays.sort(coins);

        int count = 0;

        int len = coins.length;

        for(int i = len - 1; i >= 0; i--) {

            int div = amount / coins[i];

            amount -= div * coins[i];

            count += div;

            if(amount == 0)
                break;
        }

        return count;
    }
}

/*
you need to give minimum number of coin to someone change for 39.
 */