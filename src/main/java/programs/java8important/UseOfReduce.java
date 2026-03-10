package programs.java8important;

import java.util.List;

public class UseOfReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 6);

        int result = numbers.stream()
                .reduce(10, (a, b) -> a * b);

        System.out.println(result);
    }
}
