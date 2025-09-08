package com.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciUsingMemoization {

    private static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int n = 10;
        FibonacciUsingMemoization fibonacciUsingMemoization =
                new FibonacciUsingMemoization();
        for(int i = 0; i <= n; i++) {
            int result = fibonacciUsingMemoization.printFiboNumbers(i);
            System.out.print(result + " ");
        }
    }

    //Top-Down Approach (Memoization)
    private int printFiboNumbers(int n) {
        if(n <= 1)
            return n; //base cases f(0) = 0, f(1) = 1

        if(memo.containsKey(n)) {
            return memo.get(n); //Return memoized result if available
        }

        int result = printFiboNumbers(n - 1) + printFiboNumbers(n - 2);
        memo.put(n, result); // Store the result for future use

        return result;
    }
}
