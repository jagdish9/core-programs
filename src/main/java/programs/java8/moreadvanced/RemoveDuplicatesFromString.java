package programs.java8.moreadvanced;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "banana";

        String output = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
