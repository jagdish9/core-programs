package programs.fibonacci;

public class FibonacciUsingDynamicProgramming {
    public static void main(String[] args) {
        int n = 10;
        FibonacciUsingDynamicProgramming fibonacciUsingDynamicProgramming =
                new FibonacciUsingDynamicProgramming();
        int[] fibSeries = fibonacciUsingDynamicProgramming.printFibonacciNumber(n);
        for(int i = 0; i < fibSeries.length; i++) {
            System.out.print(fibSeries[i] + " ");
        }
    }

    //Bottom-Up approach (Tabulation)
    private int[] printFibonacciNumber(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] fib = new int[n + 1];
        fib[0] = 0; // Base case for F(0)
        if (n >= 1) {
            fib[1] = 1; // Base case for F(1)
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
