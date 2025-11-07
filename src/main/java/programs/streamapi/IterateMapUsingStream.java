package programs.streamapi;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateMapUsingStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sujay", 70);
        map.put("Ajay", 80);
        map.put("Sanjay", 60);
        map.put("Vijay", 50);
        map.put("Dhananjay", 90);
        map.put("jay", 40);

        map.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " "+e.getValue()));

        Map<String, Integer> updatedMap = map.entrySet().stream()
                .filter(e -> e.getValue() > 50)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println();
        System.out.println("New Map");
        updatedMap.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " "+ e.getValue()));
    }
}
