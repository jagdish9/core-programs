package programs.java8revision.questionstr;

import java.util.stream.Collectors;

public class SortCharacter {
    public static void main(String[] args) {
        String str = "stream";

        String output = str.chars()
                .mapToObj(m -> String.valueOf((char) m))
                .sorted()
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
