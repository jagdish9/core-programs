package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Java Stream API";

        String output = Arrays.stream(sentence.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
