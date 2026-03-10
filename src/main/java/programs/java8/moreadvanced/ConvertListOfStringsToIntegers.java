package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfStringsToIntegers {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");

        List<Integer> output = list.stream()
                .map(m -> Integer.parseInt(m))
                .toList();

        System.out.println(output);
    }
}
