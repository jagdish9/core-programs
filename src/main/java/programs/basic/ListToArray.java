package programs.basic;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);

        int[] output = ls.stream().mapToInt(i -> i).toArray();

        System.out.println(output);
    }
}
