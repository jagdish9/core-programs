package programs.java8revision.common;

import java.util.List;

public class FindLongestCommonSubstring {
    public static void main(String[] args) {
        List<String> ls = List.of("flower", "flow", "flight");

        String prefix = ls.get(0);

        for(int i = 1; i < ls.size(); i++) {
            while(!ls.get(i).startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        System.out.println(prefix);
    }
}
