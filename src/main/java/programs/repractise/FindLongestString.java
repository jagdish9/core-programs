package programs.repractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("ajay", "sanjay", "vijay", "mikhanjal", "subh", "ansh");

        ls.stream()
                .collect(Collectors.toMap(s -> s, st -> st.length()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        ls.stream()
                .max(Comparator.comparing(String::length))
                .stream().findFirst()
                .ifPresent(System.out::println);
    }
}
