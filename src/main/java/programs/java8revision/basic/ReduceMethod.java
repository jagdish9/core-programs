package programs.java8revision.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {
        //Example (finding the longest string)
        List<String> words = Arrays.asList("Java", "Python", "Javascript");
        Optional<String> longest = words.stream()
                .reduce((s1, s2) -> (s1.length() > s2.length()) ? s1 : s2);
        System.out.println(longest.get());

        //Example (summing integers):
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //Example (calculating total length of strings):
        List<String> words2 = Arrays.asList("Our", "Mathematical", "Universe");
        int len = words2.stream()
                .reduce(0, (t, w) -> t + w.length(), Integer::sum);
        System.out.println(len);
    }
}

/*
The reduce method in Java 8 streams is a terminal operation used to combine the elements of a stream
into a single summary result by repeatedly applying an associative accumulation function.
This process is also known as "folding" in functional programming.
 */