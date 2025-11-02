package newprogram;

import java.util.Scanner;

public class FibonacciWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibNumber = scanner.nextInt();
        printFibonacciNumber(fibNumber);
    }

    public static void printFibonacciNumber(int fibNumber) {
        int a0 = 0;
        int a1 = 1;

        System.out.print(a0 + " "+a1);
        int fib = 0;
        for(int i = 3; i <= fibNumber; i++) {
            //while(fib <= fibNumber) {
            fib = a0 + a1;
            a0 = a1;
            a1 = fib;
           // i = fib;
            System.out.print(" " +fib);
        }
    }
}

// 0 1 1 2 3 5 8