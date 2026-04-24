package programs.company.zemosopre;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = groupAnagrams(str);

        System.out.println(output);
    }

    private static List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : str) {
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String key = new String(c);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
