package programs.company.accenture;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramList = groupAnagrams(input);
        System.out.println(anagramList);
    }

    private static List<List<String>> groupAnagrams(String[] input) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String eachInput : input) {
            char[] sortedChar = eachInput.toCharArray();
            Arrays.sort(sortedChar);
            String key = new String(sortedChar);

            /*if(anagramMap.containsKey(key)) {
                List<String> anagramList = anagramMap.get(key);
                anagramList.add(eachInput);
                anagramMap.put(key, anagramList);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(eachInput);
               anagramMap.put(key, anagramList);
            }*/

            //or

            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(eachInput);
        }

        return anagramMap.entrySet().stream()
                .map(Map.Entry::getValue)
                .toList();
    }
}

//anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(eachInput);
