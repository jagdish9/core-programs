package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondLargestElementUsingStream {
    public static void main(String[] args) {
        int[] arr = {10,30,50,60,20};

        OptionalInt output = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .mapToInt(a -> Integer.valueOf(a))
                .skip(1)
                .findFirst();

        output.ifPresent(System.out::println);
    }
}
