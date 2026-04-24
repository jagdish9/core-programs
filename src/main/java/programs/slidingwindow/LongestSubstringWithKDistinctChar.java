package programs.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctChar {
    public static void main(String[] args) {
        String input = "eceba";
        int k = 2;
        int len = getLenOfLongestSubstring(input, k);
        System.out.println(len);
    }

    private static int getLenOfLongestSubstring(String input, int k) {
        Map<Character, Integer> windowCharCount = new HashMap<>();
        int windowStart = 0;
        int maxLen = Integer.MIN_VALUE;
        int start = 0;

        for(int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char c = input.charAt(windowEnd);
            windowCharCount.put(c, windowCharCount.getOrDefault(c, 0) + 1);

            //shrink the window when map size > k
            while(windowCharCount.size() > k) {
                char leftChar = input.charAt(windowStart);

                //Discard the char from map
                windowCharCount.put(leftChar, windowCharCount.get(c) - 1);
                if(windowCharCount.get(leftChar) == 0) {
                    windowCharCount.remove(leftChar);
                }

                //shrink the window
                windowStart++;
            }

            if(windowCharCount.size() == k) {
                maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
            }
            //start = windowStart;
        }

        //System.out.println(input.substring(start, start+maxLen));
        return maxLen;
    }
}

//Fruits Into Baskets problem is same as this
