package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfStringsToMapByLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("java", "python", "rust", "golang", "c++", ".net");

        Map<Integer, List<String>> output = input.stream()
                .collect(Collectors.groupingBy(String::length));

        output.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}

//Convert List<String> → Map<Length, List<String>>
