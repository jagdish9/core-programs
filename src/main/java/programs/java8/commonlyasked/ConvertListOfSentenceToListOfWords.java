package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListOfSentenceToListOfWords {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "java is a programming language",
                "python is a scripting language",
                "HTML is a markup language"
        );

        Set<String> output = list.stream()
                .flatMap(m -> Arrays.stream(m.split(" ")))
                .collect(Collectors.toSet());

        System.out.println(output);
    }
}
