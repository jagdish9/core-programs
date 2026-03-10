package programs.java8revision.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindSecondLargestElementUsingStream {
    public static void main(String[] args) {
        int[] arr = {10,30,50,60,20};

        OptionalInt secondLargestElement = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .mapToInt(i -> Integer.valueOf(i))
                .findFirst();

        secondLargestElement.ifPresent(System.out::println);
    }
}
