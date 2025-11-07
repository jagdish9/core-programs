package programs.java8.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String input = "my, name. is Abc";

        List<String> words = Arrays.asList(input.split(" "));

        Collections.reverse(words);

        String output = String.join(" ", words);
        System.out.println(output);
    }
}
