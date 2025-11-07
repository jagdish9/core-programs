package programs.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5000);
        map.put("B", 6000);
        map.put("C", 7000);
        map.put("D", 8000);
        map.put("E", 9000);
        map.put("F", 4000);
        map.put("G", 3000);
        map.put("H", 7000);

        int n = 3;

        Map.Entry<String, Integer> result = getNthHighestSalary(map, n);

        System.out.println(result.getKey() + " " + result.getValue());

        Map.Entry<Integer, List<String>> result1 = getNthHighestSalaryByGrouping(map, n);

        System.out.println(result1.getKey() + " " + result1.getValue());
    }

    private static Map.Entry<Integer, List<String>> getNthHighestSalaryByGrouping(Map<String, Integer> map, int n) {
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(n-1);
    }

    private static Map.Entry<String, Integer> getNthHighestSalary(Map<String, Integer> map, int n) {
        return map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(n-1);
    }
}
