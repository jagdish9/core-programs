package programs.java8.moreadvanced;

import java.util.Arrays;

public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Java Stream API Interview Questions";

        long count = Arrays.stream(sentence.split(" "))
                .count();

        System.out.println(count);
    }
}
