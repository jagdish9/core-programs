package programs.company.accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagramUsingJava8 {

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramList = groupAnagramsUsingStreamApi(input);
        System.out.println(anagramList);
    }

    private static List<List<String>> groupAnagramsUsingStreamApi(String[] input) {
        return new ArrayList<>(Arrays.stream(input)
                .collect(Collectors.groupingBy(
                        eachInput -> {
                            char[] sortedChar = eachInput.toCharArray();
                            Arrays.sort(sortedChar);
                            return new String(sortedChar);
                        }
                ))
                .values());
    }
}
