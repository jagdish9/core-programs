package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SplitSentenceBySpace {
    public static void main(String[] args) {
        String sentence = "java is awesome and java is powerful";

        List<String> output = Arrays.stream(sentence.split(" "))
                .distinct()
                .sorted(Comparator.comparingInt(value -> value.length()))
                .toList();

        System.out.println(output);
    }
}

//Split a sentence by space, remove duplicates, and sort by length
