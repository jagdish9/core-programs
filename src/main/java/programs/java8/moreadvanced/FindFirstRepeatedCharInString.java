package programs.java8.moreadvanced;

import java.util.stream.Collectors;

public class FindFirstRepeatedCharInString {
    public static void main(String[] args) {
        String str = "abclb";

        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(m -> m.getKey())
                .findFirst()
                .get();

        System.out.println(ch);
    }
}
