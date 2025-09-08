package com.hackerrank;

import java.util.Arrays;
import java.util.List;

public class DesignedPdfViewer {
    public static void main(String[] args) {
        List<Integer> h = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        String word = "abc";

        int max = h.get(word.charAt(0) - 97);
        for(int i = 1; i < word.length(); i++) {
            if(max < h.get(word.charAt(i) - 97)) {
                max = h.get(word.charAt(i) - 97);
            }
        }

       System.out.println(word.length() * max);
    }
}
