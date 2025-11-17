package programs.java8.strqustn;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java 8 stream examples";

        String output = Arrays.stream(str.split("\\s+"))
                .map(m -> new StringBuilder(m).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
