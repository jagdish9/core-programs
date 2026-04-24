package programs.company.publiciessapient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDominator {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 2, 3, -1, 3, 3};
        int dominator = getDominator(arr);

        System.out.print(dominator);
    }

    private static int getDominator(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(1)
                .findFirst()
                .get();
    }
}
