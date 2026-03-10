package programs.java8.strqustn;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateChar {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> set = str.chars()
                .mapToObj(m -> (char) m)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(m -> m.getKey())
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
