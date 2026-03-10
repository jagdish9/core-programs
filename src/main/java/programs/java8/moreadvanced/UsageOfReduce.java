package programs.java8.moreadvanced;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class UsageOfReduce {
    public static void main(String[] args) {

        int n = 5;

        OptionalInt sum = IntStream.rangeClosed(1, n)
                .reduce((a, b) -> a + b);

        OptionalInt fact = IntStream.rangeClosed(1, n)
                .reduce((a, b) -> a * b);

        sum.ifPresent(System.out::println);
        fact.ifPresent(System.out::println);
    }
}
