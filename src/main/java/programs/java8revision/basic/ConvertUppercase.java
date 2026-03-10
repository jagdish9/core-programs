package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;

public class ConvertUppercase {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("kite", "meena", "sanjay");

        List<String> output = str.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
