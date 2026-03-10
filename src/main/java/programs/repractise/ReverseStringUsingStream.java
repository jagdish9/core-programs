package programs.repractise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String str = "hello world";

        String reverseSString = IntStream.range(0, str.length())
                .mapToObj(c -> str.charAt(str.length() - 1 - c))
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        System.out.println(reverseSString);
    }
}
