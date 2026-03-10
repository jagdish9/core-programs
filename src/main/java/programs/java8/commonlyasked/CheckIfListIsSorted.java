package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CheckIfListIsSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6, 8, 10, 12);

        boolean isSorted = IntStream.range(0, list.size() - 1)
                .allMatch(value -> list.get(value) <= list.get(value + 1));

        System.out.println(isSorted);
    }
}
