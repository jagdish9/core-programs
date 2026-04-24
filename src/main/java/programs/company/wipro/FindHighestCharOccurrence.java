package programs.company.wipro;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestCharOccurrence {
    public static void main(String[] args) {
        String str = "Anita kumari";

        str.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
