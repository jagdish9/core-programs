package programs.repractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTop3HighestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);

        List<Integer> output = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(output);
    }
}
