package com.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class HurdleRace {

    public static void main(String[] args) {
        int k = 4;
        List<Integer> heights = Arrays.asList(1, 6, 3, 5, 2);

        /*heights.stream().forEach(height -> System.out.println(height + " "));
        System.out.println("--------");
        heights.forEach(System.out::println);
        System.out.println("--------");*/

        AtomicInteger maxHeight = new AtomicInteger(0);
        heights.forEach(height -> {
            if(height > k && height > maxHeight.get()) {
                maxHeight.set(height);
            }
        });

        if(maxHeight.get() != 0) {
            System.out.println(maxHeight.get() - k);
        } else {
            System.out.println(maxHeight.get());
        }
    }
}
