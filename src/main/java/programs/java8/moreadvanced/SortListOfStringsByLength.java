package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortListOfStringsByLength {
    public static void main(String[] args) {
        String sentence = "Java Stream API Interview Questions";

        List<String> output = Arrays.stream(sentence.split(" "))
                .sorted(Comparator.comparingInt(c -> c.length()))
                .toList();

        System.out.println(output);
    }
}
