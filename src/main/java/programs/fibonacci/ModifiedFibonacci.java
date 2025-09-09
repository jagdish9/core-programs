package programs.fibonacci;

public class ModifiedFibonacci {
    public static int fibonacciModified(int t1, int t2, int n) {
        // Write your code here

        long[] arr = new long[n];
        arr[0] = t1;
        arr[1] = t2;

        for(long i = 2; i < n; i++) {
           // arr[i] = arr[i - 2] + (long) Math.pow(arr[i - 1], 2);
            arr[Math.toIntExact(i)] = (long) (arr[Math.toIntExact(i - 2)] + Math.pow(arr[Math.toIntExact(i - 1)], 2));
        }

        return  (int) arr[n - 1];
    }
}

//https://www.hackerrank.com/challenges/fibonacci-modified/problem?isFullScreen=true
