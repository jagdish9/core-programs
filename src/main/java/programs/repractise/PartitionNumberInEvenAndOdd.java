package programs.repractise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumberInEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Map<Boolean, List<Integer>> eoNumbers = ls.stream()
                .collect(Collectors.partitioningBy(eo -> eo % 2 == 0));

        eoNumbers.forEach((k, v) -> {
            String output = k == true ? "Even" : "Odd";
            System.out.println(output);
            v.forEach(System.out::println);
        });
    }
}
