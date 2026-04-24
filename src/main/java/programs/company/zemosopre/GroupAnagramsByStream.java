package programs.company.zemosopre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagramsByStream {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> groupAnagrams = Arrays.stream(str)
                .collect(Collectors.groupingBy(word -> {
                    char[] c = word.toCharArray();
                    Arrays.sort(c);
                    return new String(c);
                }))
                .values()
                .stream()
                .toList();

        System.out.println(groupAnagrams);
    }
}
