package programs.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExercise {
    public static void main(String[] args) {
        Predicate<Integer> isEven = s -> s % 2 == 0;

        System.out.println(isEven.test(23));
        System.out.println(isEven.test(26));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> isEven.test(x))
                .toList();

        System.out.println(evenNumbers);

        Predicate<Integer> divisibleBy3 = w -> w % 3 == 0;

        Predicate<Integer> combinationOfAbovePredicates =
                isEven.and(divisibleBy3);

        List<Integer> output = numbers.stream()
                .filter(t -> combinationOfAbovePredicates.test(t))
                .toList();

        System.out.println(output);
    }
}

/*
Predicate<T>

Represents a boolean-valued function of one argument.

Represents a boolean-valued function that takes one argument of type (T).
It's commonly used for filtering collections. It has a test() method.

Method: boolean test(T t)

Use case: Filtering data, validation logic, conditions in streams.
 */
