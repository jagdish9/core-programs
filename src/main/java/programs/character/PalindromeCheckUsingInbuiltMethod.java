package programs.character;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeCheckUsingInbuiltMethod {
    public static void main(String[] args) {
        String input = "Too hot to hoot.";
        boolean palindrome = isInputPalindrome(input);
        System.out.println(palindrome);

        boolean palindromeByStream = isInputPalindromeUsingStreamApi(input);
        System.out.println(palindromeByStream);
    }

    private static boolean isInputPalindromeUsingStreamApi(String input) {
        List<Character> characterList = input.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .toList();

        List<Character> reverseCharList = IntStream.range(0, characterList.size())
                .mapToObj(ch -> characterList.get(characterList.size() - 1 - ch))
                .toList();

        String inputString = characterList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        String reverseString = reverseCharList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return inputString.equalsIgnoreCase(reverseString);
    }

    private static boolean isInputPalindrome(String input) {
        StringBuilder passedInput = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(Character.isLetterOrDigit(input.charAt(i)))
                passedInput.append(input.charAt(i));
        }

        StringBuilder reverseInput = new StringBuilder(passedInput.toString());
        reverseInput.reverse();

        return passedInput.toString().equalsIgnoreCase(reverseInput.toString());
    }
}
