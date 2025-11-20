package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;

public class FindFirstNonEmptyString {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("", "", null, "ABC", "", null, "XYZ");

        String first = input.stream()
                .filter(f -> f != null && !f.isEmpty())
                .findFirst()
                .get();

        System.out.println(first);
    }
}
