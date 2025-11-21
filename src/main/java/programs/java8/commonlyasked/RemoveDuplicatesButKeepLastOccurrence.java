package programs.java8.commonlyasked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesButKeepLastOccurrence {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 18, 90, 34, 25, 7, 9, 87, 77, 1, 3, 18, 90, 34, 25);

        List<Integer> output = new ArrayList<>(new LinkedHashSet<>(new ArrayList<>(list)));

        System.out.println(output);
    }
}
