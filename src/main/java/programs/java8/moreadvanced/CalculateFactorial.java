package programs.java8.moreadvanced;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CalculateFactorial {
    public static void main(String[] args) {
        int n = 5;

        int fact = IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a*b);

        OptionalInt output = IntStream.range(1, n+1)
                        .reduce((a, b) -> a * b);

        System.out.println(fact);

        output.ifPresent(System.out::println);
    }
}
