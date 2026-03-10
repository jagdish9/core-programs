package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfIntegerToPrimitive {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 6, 7, 8, 12, 14, 9);

        int[] output = list.stream()
                .mapToInt(m -> m)
                .toArray();

        Arrays.stream(output).boxed().forEach(o -> System.out.print(o + " "));
    }
}
