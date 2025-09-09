package programs.fibonacci;

public class FibonacciIterativeApproach {
    public static void main(String[] args) {
        int n = 15;

        FibonacciIterativeApproach fibonacciIterativeApproach = new FibonacciIterativeApproach();
        fibonacciIterativeApproach.printFibonacciNumbers(n);
    }

    private void printFibonacciNumbers(int n) {
        int n1 = 0;
        int n2 = 1;

        for(int i = 0; i < n; i++) {
            System.out.print(n1 + " ");

            int n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
        }
    }
}
