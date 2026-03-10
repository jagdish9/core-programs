package programs.java8revision.questionstr;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseOnlyWord {
    public static void main(String[] args) {
        String str = "Java 8 stream examples";

        String output = Arrays.stream(str.split(" "))
                .map(m -> new StringBuilder(m).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
