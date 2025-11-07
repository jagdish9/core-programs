package programs.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyDataUsingStream {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = new ArrayList<>();

        List<Integer> newList = ls.stream()
                .filter(e -> e % 2 == 0)
                .peek(e -> output.add(e*5))
                .toList();

        newList.forEach(e -> System.out.print(e + " "));
        System.out.println();
        output.forEach(e -> System.out.print(e + " "));

        List<Integer> processedInt = ls.stream()
                .filter(e -> e % 2 == 0)
                .map(n -> n*5)
                .toList();

        System.out.println();
        processedInt.forEach(s -> System.out.print(s + " "));
    }
}
