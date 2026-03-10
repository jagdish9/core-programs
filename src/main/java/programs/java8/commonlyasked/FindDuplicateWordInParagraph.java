package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateWordInParagraph {
    public static void main(String[] args) {
        String text = "java python java c c python java";

        List<String> output = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(output);

        Map<String, Long> output2 = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(output2);
    }
}
