package programs.company.optimumforpayapclientpost;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PrintMostOccurrenceOfString {
    public static void main(String[] args) {
        List<String> ls = List.of("Facebook", "Google", "Linkedin", "Facebook",
                "Instagram", "Telegram", "Apple", "Linkedin", "Apple");

        Optional<String> result = ls.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey())
                )
                .map(Map.Entry::getKey)
                .findFirst();

        result.ifPresent(System.out::println);
    }
}
