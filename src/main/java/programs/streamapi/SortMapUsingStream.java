package programs.streamapi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapUsingStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sujay", 70);
        map.put("Ajay", 80);
        map.put("Sanjay", 60);
        map.put("Vijay", 50);
        map.put("Dhananjay", 90);
        map.put("jay", 40);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " "+ e.getValue()));

        Map<String, Integer> sortedByKey = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, //// Merge function for duplicate keys (not expected here)
                        LinkedHashMap::new)); // Ensure insertion order is maintained

        System.out.println();
        System.out.println("New map");
        sortedByKey.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " "+e.getValue()));
    }
}
