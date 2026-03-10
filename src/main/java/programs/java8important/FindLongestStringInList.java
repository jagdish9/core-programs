package programs.java8important;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestStringInList {
    public static void main(String[] args) {
        List<String> ls = List.of("ajay", "sanjay", "vijay", "arjun", "ramadhir");

        Optional<String> output = ls.stream()
                .max(Comparator.comparing(s -> s.length()));

        output.ifPresent(System.out::println);
    }
}
