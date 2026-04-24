package programs.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
       // Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 20);
        map.put("B", 30);
        map.put("A", 40);

        System.out.println(map);
    }
}
