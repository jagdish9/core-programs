package programs.company.optimumforpayapclientpost;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableListTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(234, "Sherlok");
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);
        map.put(432, "Holmes");
        System.out.println(map);

        //unmodifiableMap.put(781, "David"); // Exception in thread "main" java.lang.UnsupportedOperationException
        map.put(652, "Jacks");
        System.out.println(map);
        System.out.println(unmodifiableMap);
    }
}
