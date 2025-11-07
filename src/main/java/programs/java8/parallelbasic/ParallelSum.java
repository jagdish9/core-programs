package programs.java8.parallelbasic;

import java.util.stream.IntStream;

public class ParallelSum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100)
                .parallel()
                .sum();

        System.out.println(sum);
    }
}
