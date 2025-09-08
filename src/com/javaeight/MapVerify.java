package com.javaeight;

import java.util.Arrays;
import java.util.List;

public class MapVerify {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        List<Integer> lengths = words.stream()
                .map(String::length)
                .toList();

        List<Integer> lengths1 = words.stream()
                .map(l -> l.length())
                        .toList();

        System.out.println(lengths);
        System.out.println(lengths1);
    }
}
