package programs.java8revision2.basic;

import java.util.stream.IntStream;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "madam";

        boolean palindrome = IntStream.range(0, input.length() / 2)
                .allMatch(c -> input.charAt(c) == input.charAt(input.length() - c - 1));

        System.out.println(palindrome);
    }
}
