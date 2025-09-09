package programs.javaeight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekVerify {
    public static void main(String[] args) {
        List<String> list = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .toList();
        System.out.println(list);
    }
}
