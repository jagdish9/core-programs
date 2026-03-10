package programs.java8revision.frequentlyasked;

import java.util.Arrays;
import java.util.List;

public class CartesianProductOf2List {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("abc", "xyz", "def");
        List<String> list2 = Arrays.asList("jkl", "mno", "pqr", "lmn");

        List<String> output = list1.stream()
                .flatMap(a -> list2.stream()
                        .map(b -> a + "-" + b))
                .toList();

        System.out.println(output);
    }
}
