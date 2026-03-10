package programs.java8revision.common;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "java developer";

        StringBuilder reverseStr = new StringBuilder(str).reverse();

        System.out.println(reverseStr);

        String reversed = IntStream.range(0, str.length())
                        .mapToObj(c -> str.charAt(str.length() - 1 - c))
                                .map(String::valueOf)
                                        .collect(Collectors.joining());
        System.out.println(reversed);
    }
}
