package programs.java8.moreadvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4);

        int output = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new))
                                .entrySet()
                                        .stream()
                                                .findFirst()
                                                        .get().getKey();


        System.out.println(output);
    }
}
