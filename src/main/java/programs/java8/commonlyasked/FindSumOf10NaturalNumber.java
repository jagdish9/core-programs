package programs.java8.commonlyasked;

import java.util.stream.IntStream;

public class FindSumOf10NaturalNumber {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 10)
                .sum();

        System.out.println(sum);
    }
}
