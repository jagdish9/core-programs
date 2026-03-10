package programs.java8revision.thread;

public class PrintFibonacciByRecursion {

    public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;

        int fibTill = 20;

        System.out.print(f0 + " " + f1 + " ");
        for(int i = 1; i < fibTill; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int fib) {
        if(fib <= 1) {
            return 1;
        }
        return fibonacci(fib - 1) + fibonacci(fib - 2);
    }
}
