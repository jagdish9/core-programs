package programs.java8.advancedprogram;

import java.util.stream.IntStream;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String input = "madam";

       boolean isPalindrome = IntStream.range(0, input.length() / 2)
                .allMatch(c -> input.charAt(c) == input.charAt(input.length() - c - 1));

       System.out.println(isPalindrome);
    }
}
