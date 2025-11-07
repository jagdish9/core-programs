package programs.java8.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ReverseCharacterInWord {
    public static void main(String[] args) {
        String input = "My, name. is Abc";

        String output = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
