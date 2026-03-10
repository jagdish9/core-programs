package programs.java8revision.common;

import java.util.stream.IntStream;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";

        boolean palindrome = IntStream.rangeClosed(0, str.length() / 2)
                .allMatch(x -> str.charAt(x) == str.charAt(str.length() - 1 - x));

        System.out.println(palindrome);
    }
}
