package programs.java9;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> ls = List.of("A", "B", "C");
        Set<String> set = Set.of("X", "Y", "Z");
        Map<Integer, String> map = Map.of(10, "A",
                20, "B",
                30, "C");

        System.out.println(ls);
        System.out.println(set);
        System.out.println(map);

        //Exception in thread "main" java.lang.UnsupportedOperationException
       // ls.add("D");
       // set.add("W");
       // map.put(40, "D");
    }
}
