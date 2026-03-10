package programs.repractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLengthOfStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cat");

        List<Integer> lenOfString = list.stream()
                .map(s -> s.length())
                .toList();

        System.out.println(lenOfString);

        Map<String, Integer> lenOfStrList = list.stream()
                .collect(Collectors.toMap(s -> s, String::length));

        System.out.println(lenOfStrList);
    }
}
