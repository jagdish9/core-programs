package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersIntoEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        Map<Boolean, List<Integer>> output = list.stream()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0));

        output.forEach((k, v) -> {
            System.out.println("Key: "+k);
            v.forEach(System.out::println);
            System.out.println();
        });
    }
}
