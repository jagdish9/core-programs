package programs.functionalinterface.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExercise {
    public static void main(String[] args) {
        Supplier<Integer> randomNum = () -> new Random().nextInt(100);

        System.out.println(randomNum.get());
        System.out.println(randomNum.get());

        Supplier<String> greeting = () -> "Hello world from Supplier!";
        System.out.println(greeting.get());
    }
}

/*
Supplier<T>

Represents a supplier of results — takes no input, returns a value.

Method: T get()

Use case: Lazy initialization, factory pattern, generating random values or timestamps.
 */