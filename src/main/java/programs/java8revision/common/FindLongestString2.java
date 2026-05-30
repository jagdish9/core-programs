package programs.java8revision.common;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLongestString2 {
    public static void main(String[] args) {
        List<String> ls = List.of("flower", "flow", "flight");
        longestString(ls);
    }

    private static void longestString(List<String> ls) {
        List<String> ot = ls.stream()
                .collect(Collectors.groupingBy(s1 ->  s1.length()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .limit(1)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList())
                .get(0);
        System.out.println(ot);
    }
}
