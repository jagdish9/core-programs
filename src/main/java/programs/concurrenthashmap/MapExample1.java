package programs.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample1 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "A");
        map.put(3, "C");
        map.putIfAbsent(1, "B");

        System.out.println(map);

        map.compute(3, (key, value) -> value + "new");
        System.out.println(map);

        map.replace(3, "D");

        System.out.println(map);

        for(Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " -> "+ m.getValue());
            map.put(4, "E"); //allowed
        }
    }
}
