package programs.company.capgemini;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> length = str -> str.length();

        System.out.println(length.apply("Java"));
    }
}
