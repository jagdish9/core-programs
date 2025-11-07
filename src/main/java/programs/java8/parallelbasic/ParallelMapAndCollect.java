package programs.java8.parallelbasic;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelMapAndCollect {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();

        System.out.println(numbers);

        List<Integer> output = numbers.parallelStream()
                .map(m -> m * m)
                .toList();

        System.out.println(output);
    }
}
