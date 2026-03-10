package programs.company.optimumforpayapclientpost;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSumOfValueOccurredMoreThanOne {
    public static void main(String[] args) {
        String[][] str = {
            {"1", "4", "5"},
            {"3", "5", "2"},
            {"7", "2", "5"}
        };

        findOccurredMoreThanOne(str);
    }

    private static void findOccurredMoreThanOne(String[][] str) {
        int[][] arr = new int[str.length][str.length];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(str[i][j]);
            }
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                int key = arr[i][j];
                if(map.containsKey(key)) {
                    int value = map.get(key);
                    value = value + 1;
                    map.put(key, value);
                } else {
                    map.put(key, 1);
                }
            }
        }

        int result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .sum();

        System.out.println(result);
    }
}
