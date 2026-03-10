package programs.company.infogain.flatmap;

import java.util.*;
import java.util.stream.Stream;

public class FlatMapHandleNull {
    public static void main(String[] args) {
        List<List<String>> input = Arrays.asList(
                Arrays.asList("A", "B", "C"),
                Arrays.asList("D", "E", "F"),
                null,
                Arrays.asList("X", "Y", "Z")
        );

        /*List<String> output = input.stream()
                .flatMap(Collection::stream) // it will throw null pointer exception
                .toList();
        System.out.println(output);*/

        //Solution 1: Filter Null Before flatMap
        List<String> output = input.stream()
                        .filter(Objects::nonNull)
                                .flatMap(Collection::stream)
                                        .toList();
        System.out.println(output);

        //Solution 2: Handle Null Inside flatMap (Better Approach)
        List<String> output2 = input.stream()
                        .flatMap(d -> d == null ? Stream.empty() : d.stream())
                                .toList();
        System.out.println(output2);

        //Solution 3: Using Optional (Advanced Clean Way)
        List<String> output3 = input.stream()
                .flatMap(d -> Optional.ofNullable(d).stream().flatMap(Collection::stream))
                .toList();
        System.out.println(output3);

        //Solution 3: Using Optional (Advanced Clean Way)
        List<String> output4 = input.stream()
                        .flatMap(f -> Stream.ofNullable(f))
                                .flatMap(Collection::stream)
                                        .toList();
        System.out.println(output4);

    }
}
