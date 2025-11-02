package programs.java8.basic;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Bharat", "Chitra");

        names.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
