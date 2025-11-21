package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllElementsThatAppearExactlyOnce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 18, 90, 34, 25, 7, 9, 87, 77, 1, 3, 18, 90, 34, 25);

        List<Integer> output = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(m -> m.getKey())
                .toList();

        System.out.println(output);
    }
}
