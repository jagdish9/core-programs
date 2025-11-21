package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestPalindromeInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "racecar", "level", "samasy", "aba");

        String output = list.stream()
                .filter(s -> new StringBuilder(s).reverse().toString().equals(s))
                .max(Comparator.comparingInt(s -> s.length()))
                .orElse(null);

        System.out.println(output);

        String output2 = list.stream()
                .filter(s -> new StringBuilder(s).reverse().toString().equals(s))
                .min(Comparator.comparingInt(s -> s.length()))
                .orElse(null);

        System.out.println(output2);
    }
}
