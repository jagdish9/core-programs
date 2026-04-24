package programs.java8functions;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lenOfString = str -> str.length();

        System.out.println(lenOfString.apply("World"));
    }
}
