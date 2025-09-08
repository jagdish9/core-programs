package com.fibonacci;

public class FibonacciRecursiveApproach {
    public static void main(String[] args) {
        int n = 10;
        FibonacciRecursiveApproach fibonacciRecursiveApproach = new FibonacciRecursiveApproach();
        for(int i = 0; i < n; i++) {
            int fNumber = fibonacciRecursiveApproach.printFibonacciNumbers(i);
            System.out.print(fNumber + " ");
        }
    }

    private int printFibonacciNumbers(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        return printFibonacciNumbers(n - 1) + printFibonacciNumbers(n - 2);
    }
}
