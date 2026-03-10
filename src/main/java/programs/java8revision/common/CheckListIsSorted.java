package programs.java8revision.common;

import java.util.List;
import java.util.stream.IntStream;

public class CheckListIsSorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 30, 50, 70, 90, 110, 13);

        boolean sorted = IntStream.range(0, list.size() - 1)
                .allMatch(v -> list.get(v) <= list.get(v+1));

        System.out.println(sorted);
    }
}
