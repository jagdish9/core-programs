package programs.company.zopsmart;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepetitiveChar {
    public static void main(String[] args) {
        //String str = "programming";
        //String str = "swiss"; // 1
        String str = "swisiws"; // -1
        String output = getFirstNonRChar(str);
        System.out.println(output);
    }

    private static String getFirstNonRChar(String str) {
        Character output = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(f -> f.getValue() == 1)
                .map(m -> m.getKey())
                .findFirst()
                .orElse(null);

        if(output != null) {
            for(int i = 0; i < str.length(); i++) {
                if(output == str.charAt(i)) {
                    return String.valueOf(i);
                }
            }
        }

        return "-1";
    }
}

/*
Given a string, find the first non-repeating character in it and return its index.
If it does not exist, return -1.
 */
