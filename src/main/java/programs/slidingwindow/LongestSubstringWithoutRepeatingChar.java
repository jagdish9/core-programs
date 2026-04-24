package programs.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String input = "aexpewzq";
        String output = getLongestSubstring(input);
        System.out.println(output);
    }

    private static String getLongestSubstring(String input) {
        int left = 0;
        int maxLen = 0;
        int start = 0;

        Set<Character> set = new HashSet<>();

        for(int right = 0; right < input.length(); right++) {
            while(set.contains(input.charAt(right))) {
                set.remove(input.charAt(left));
                left++;
            }
            set.add(input.charAt(right));

            /*if(right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }*/

            maxLen = Math.max(maxLen, right - left + 1);
            start = left;
        }

        return input.substring(start, start + maxLen);
    }
}
