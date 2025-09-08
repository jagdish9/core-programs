package com.hackerrank;

public class HackerRankString {
    public static void main(String[] args) {
        String sequence = "hackerrank";
        String subSequence = "hackerworld";
        String output = isSubsequenceFound(sequence, subSequence);
        System.out.println(output);
    }

    private static String isSubsequenceFound(String sequence, String subSequence) {
        if(subSequence.length() < sequence.length())
            return "NO";

        int j = 0;
        for(int i = 0; i < subSequence.length(); i++) {
            if((j <= sequence.length() - 1) && (subSequence.charAt(i) == sequence.charAt(j))) {
                j++;
            }
        }

        return j == sequence.length() ? "YES" : "NO";
    }
}
