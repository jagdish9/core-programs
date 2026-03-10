package programs.character;

import java.util.stream.IntStream;

public class PalindromeUsingRange {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        String inputClean = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        boolean isPalindrome = IntStream.rangeClosed(0, inputClean.length() / 2)
                .allMatch(x -> inputClean.charAt(x) == inputClean.charAt(inputClean.length() - 1 - x));

        System.out.println(isPalindrome);
    }
}
