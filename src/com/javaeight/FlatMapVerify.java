package com.javaeight;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapVerify {
    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 4),
                Arrays.asList(3, 2, 5)
        );

        List<Integer> flattenNumbers = nestedNumbers.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flattenNumbers);
    }
}
