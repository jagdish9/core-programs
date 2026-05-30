package programs.java11;

import java.util.List;

public class VarVariable {
    public static void main(String[] args) {
        List<String> names = List.of("Vishal", "Ankit");

        names.forEach(name -> System.out.print(name + " "));

        System.out.println();

        names.forEach((var name) -> {
            System.out.println(name);
        });
    }
}

/*
Why Useful?
Improves readability
Helps when using annotations in lambda parameters

Example:

(@Nonnull var name) -> name.length()
 */