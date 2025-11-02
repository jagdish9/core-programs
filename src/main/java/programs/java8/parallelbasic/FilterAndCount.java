package programs.java8.parallelbasic;

import java.util.Arrays;
import java.util.List;

public class FilterAndCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mike", "Sara", "Megan", "Paul");

        long count = names.parallelStream()
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println(count);
    }
}
