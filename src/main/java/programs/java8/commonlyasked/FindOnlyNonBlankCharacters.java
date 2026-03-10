package programs.java8.commonlyasked;

import java.util.Arrays;
import java.util.List;

public class FindOnlyNonBlankCharacters {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "xyz", null, "zz", "", null);

        List<String> output = list.stream()
                .filter(f -> f != null && !f.isEmpty())
                .toList();

        System.out.println(output);
    }
}
