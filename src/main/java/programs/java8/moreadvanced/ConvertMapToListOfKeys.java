package programs.java8.moreadvanced;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToListOfKeys {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A", 1, "B", 2);

        List<String> keys = map.keySet()
                .stream()
                .toList();

        System.out.println(keys);
    }
}
