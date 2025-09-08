package com.array;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "aabbccc";

        char output = getFirstNonRepeatingChar(input);

        System.out.println(output);
    }

    private static char getFirstNonRepeatingChar(String input) {
        char c = '$';
        for(int i = 0; i < input.length(); i++) {
            boolean found = false;
            for(int j = 0; j < input.length(); j++) {
                if(i != j && input.charAt(i) == input.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                c = input.charAt(i);
                break;
            }
        }

        return c;
    }
}

//Time complexity: n^2