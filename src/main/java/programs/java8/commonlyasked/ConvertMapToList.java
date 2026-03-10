package programs.java8.commonlyasked;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 10, "X", 8, "C", 12, "Z", 18, "W", 13);

        List<String> output = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(output);
    }
}

//Convert Map<String, Integer> → List<String> sorted by value
