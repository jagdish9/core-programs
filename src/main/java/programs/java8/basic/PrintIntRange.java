package programs.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintIntRange {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30);

        int start = 10;
        int end = 22;

        List<Integer> output = IntStream.rangeClosed(start, end)
                        .mapToObj(ls::get).toList();

        System.out.println(output);
    }
}
