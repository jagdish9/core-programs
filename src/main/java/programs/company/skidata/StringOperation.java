package programs.company.skidata;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {
        List<String> list = List.of("Bahadur", "Singh", "Tejaswai",
                "Hawo", "Aaram", "Dangerous", "Khatra", "Easy", "Topikar",
                "Albatta", "Hawo", "Hawo");

        List<String> list2 = List.of("success", "failure", "Hawo");

        //Group string by length
        Map<Integer, List<String>> groupByLength = list.stream()
                .collect(Collectors.groupingBy(
                        String::length
                ));

        //Partition number into even and odd
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Map<Boolean, List<Integer>> evenAndOddNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        //Find most frequent element
        list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        //Flatten list of lists
        List<List<Integer>> listsOfList = List.of(
                List.of(1,2),
                List.of(3,4),
                List.of(5,6)
        );
        List<Integer> flatOutput = listsOfList.stream()
                .flatMap(s -> s.stream())
                .toList();
        System.out.println(flatOutput);

        //Join Strings by comma
        String joinedByComma = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(joinedByComma);

        //Find most frequent element
       list.stream()
               .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
               .entrySet()
               .stream()
               .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
               .limit(1)
               .map(Map.Entry::getKey)
               .forEach(System.out::println);

       //Find longest string
        list.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);

        //Find common elements between 2 lists
        list.stream()
                .filter(s -> list2.contains(s))
                .toList()
                .forEach(System.out::println);
    }
}
