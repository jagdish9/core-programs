package programs.turing;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String word = "abcdefabcbb";
        int len = getLongestSubString(word);
        System.out.println(len);
    }

    private static int getLongestSubString(String word) {
        int totalCount = 0;
        for(int i = 0; i < word.length(); i++) {
            int count = 0;
            boolean[] visited = new boolean[26];

            for(int j = i; j < word.length(); j++) {
                if(visited[word.charAt(j) - 'a']) {
                    break;
                }
                else {
                    count++;
                    visited[word.charAt(j) - 'a'] = true;
                }
            }

            if(count > totalCount)
                totalCount = count;
        }

        return totalCount;
    }
}
