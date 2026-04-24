package programs.ds;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String input = "fun&!! time";

        String longestWord = getLongestWord(input);
        System.out.println(longestWord);
    }

    private static String getLongestWord(String input) {
        input = input.replaceAll("[^a-zA-Z ]", "");

       /* return Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(String::length))
                .get();*/

        String longest = "";

        for(String str : input.split(" ")) {
            if(str.length() > longest.length())
                longest = str;
        }

        return longest;
    }
}
