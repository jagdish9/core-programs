package programs.java8.moreadvanced;

import java.util.stream.Collectors;

public class CheckStringsAreAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram = s1.chars()
                .sorted()
                .boxed()
                .toList()
                .equals(s2.chars()
                        .sorted()
                        .boxed()
                        .collect(Collectors.toList()));

        System.out.println(isAnagram);
    }
}
