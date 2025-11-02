package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        numbers.stream()
                .distinct()
                .forEach(e -> System.out.print(e +" "));
    }
}
