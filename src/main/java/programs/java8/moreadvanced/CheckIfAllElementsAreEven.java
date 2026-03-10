package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.List;

public class CheckIfAllElementsAreEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);

        boolean even = list.stream()
                .allMatch(r -> r % 2 == 0);

        System.out.println(even);
    }
}
