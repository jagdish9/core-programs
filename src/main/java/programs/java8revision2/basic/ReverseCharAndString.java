package programs.java8revision2.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseCharAndString {
    public static void main(String[] args) {
        String input = "My, name. is Abc";

        //reverse whole string
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);

        //reverse each string only
        String reverseEachString = Arrays.stream(input.split(" "))
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverseEachString);

        //reverse each word only and preserve special char
        String revereWordAndPreserveSpecialChar = Arrays.stream(input.split(" "))
                .map(word -> {
                    List<Character> charList = word.chars()
                            .mapToObj(c -> (char) c)
                            .filter(Character::isLetter)
                            .collect(Collectors.toList());

                    Collections.reverse(charList);
                    Iterator<Character> iterator = charList.iterator();

                    return word.chars()
                            .mapToObj(c -> (char) c)
                            .map(ch -> Character.isLetter(ch) ? iterator.next() : ch)
                            .map(String::valueOf)
                            .collect(Collectors.joining());

                })
                .collect(Collectors.joining(" "));

        System.out.println(revereWordAndPreserveSpecialChar);
    }
}
