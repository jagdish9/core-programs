package programs.java8revision.questionstr;

import java.util.stream.IntStream;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";

        boolean match = IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));

        System.out.println(match);
    }
}

