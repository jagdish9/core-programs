package programs.java8.strqustn;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "world!";

        String output = new StringBuilder(str).reverse().toString();

        System.out.println(output);

        String reversed = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        ls -> {
                            Collections.reverse(ls);
                            return ls.stream()
                                    .map(s -> String.valueOf(s))
                                    .collect(Collectors.joining());
                        }
                ));

        System.out.println(reversed);
    }
}
