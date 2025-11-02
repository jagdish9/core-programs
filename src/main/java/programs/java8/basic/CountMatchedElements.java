package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class CountMatchedElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 3, 2, 30, 12);

        //count greater than 5
        long output = numbers.stream()
                .filter(x -> x > 5)
                .count();

        System.out.println(output);
    }
}
