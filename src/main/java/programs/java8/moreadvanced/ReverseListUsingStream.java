package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseListUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);

        List<Integer> output = IntStream.range(0, list.size())
                .mapToObj(i -> list.get(list.size() - 1 - i))
                .toList();

        System.out.println(output);
    }
}
