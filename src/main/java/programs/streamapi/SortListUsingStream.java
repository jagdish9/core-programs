package programs.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListUsingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sanjay", "vijay", "ajay", "jay", "dhananjay", "laxmi vijay");

        list.stream()
                .sorted().forEach(e -> System.out.println(e));

        System.out.println();
        System.out.println("List in sorted order:");
        list.stream()
                .sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
