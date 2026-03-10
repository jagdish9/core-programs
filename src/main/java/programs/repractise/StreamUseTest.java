package programs.repractise;

import java.util.stream.Stream;

public class StreamUseTest {
    public static void main(String[] args) {
        Stream<Integer> stream =
                Stream.of(1,2,3);

        stream.forEach(System.out::println);

        stream.forEach(System.out::println);
    }
}
