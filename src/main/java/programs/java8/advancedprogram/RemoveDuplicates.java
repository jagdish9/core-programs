package programs.java8.advancedprogram;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);

        List<Integer> output = list.stream()
                .distinct()
                .toList();

        System.out.println(output);
    }
}
