package programs.java8functions;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> even = no -> no % 2 == 0;

        System.out.println(even.test(50));
    }
}
