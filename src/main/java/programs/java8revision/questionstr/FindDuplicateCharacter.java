package programs.java8revision.questionstr;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "programming";

        List<Character> output = str.chars()
                .mapToObj(m -> (char) m)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(m -> m.getKey())
                .toList();

        System.out.println(output);
    }
}
