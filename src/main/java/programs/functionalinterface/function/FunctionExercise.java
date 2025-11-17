package programs.functionalinterface.function;

import java.util.function.Function;

public class FunctionExercise {
    public static void main(String[] args) {
        String str = "Hello World!";

        Function<String, Integer> lengthFunc = String::length;

        System.out.println(lengthFunc.apply("Python"));
        System.out.println(lengthFunc.apply("MongoDB"));

        Function<Integer, Integer> square = x -> x*x;
        Function<Integer, Integer> add = x -> x+x;

        System.out.println(square.apply(5));

        System.out.println(lengthFunc.andThen(square).andThen(add).apply("Wah!"));
    }
}

/*
Function<T, R>

Represents a function that takes an input (T) and returns a result (R).

Method: R apply(T t)

Use case: Data transformation — mapping one type to another.
 */
