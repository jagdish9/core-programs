package programs.subsequence;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        LongestUniqueSubString longestUniqueSubString =
                new LongestUniqueSubString();
        int output = longestUniqueSubString.uniqueLenOfSubString(input);
        System.out.print(output);
    }

    private int uniqueLenOfSubString(String input) {
        int len = input.length();
        int maxLen = 0;
        for(int i = 0; i < len; i++) {
            boolean[] visited = new boolean[26];

            for(int j = i; j < len; j++) {
                if(visited[input.charAt(j) - 'a']) {
                    break;
                }
                else {
                    maxLen = Math.max(maxLen, j - i + 1);
                    visited[input.charAt(j) - 'a'] = true;
                }
            }
        }
        return maxLen;
    }
}
