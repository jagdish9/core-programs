package programs.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        //String input = "aexpewzq";
        String input = "abcabcbb";
        int len = getLenOfLongestSubstringChar(input);
        System.out.println(len);
    }

    private static int getLenOfLongestSubstringChar(String input) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int startIndex = 0;

        for(int right = 0; right < input.length(); right++) {
            while(set.contains(input.charAt(right))) {
                set.remove(input.charAt(left));
                left++;
            }
            set.add(input.charAt(right));

            int tmp = right - left + 1;
            if(tmp > maxLength) {
                maxLength = tmp;
                startIndex = left;
            }
        }

        System.out.println(input.substring(startIndex, startIndex + maxLength));
        return maxLength;
    }
}
