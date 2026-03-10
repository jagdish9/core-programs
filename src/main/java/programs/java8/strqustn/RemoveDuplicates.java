package programs.java8.strqustn;

import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String output = str.chars()
                .mapToObj(c -> String.valueOf((char)c))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(output);
    }
}
