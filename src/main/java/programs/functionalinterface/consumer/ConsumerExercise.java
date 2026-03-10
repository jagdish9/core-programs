package programs.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExercise {
    public static void main(String[] args) {
        Consumer<String> displayUpper = str -> System.out.println(str.toUpperCase());

        displayUpper.accept("Kirodimal");

        List<String> list = Arrays.asList("python", "java", "rust", "Golang", "nodeJS");
        list.forEach(s -> displayUpper.accept(s));
    }
}

/*
Consumer<T>

Represents an operation that takes a value (T) but returns nothing.

Method: void accept(T t)

Use case: Logging, printing, updating objects, saving to DB — any side-effect action.
 */
