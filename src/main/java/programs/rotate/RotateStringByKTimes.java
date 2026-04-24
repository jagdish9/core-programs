package programs.rotate;

import java.util.Arrays;

public class RotateStringByKTimes {
    public static void main(String[] args) {
        String input = "abcdef";
        int k = 2;

        System.out.println(input);
        String output = rotateStr(input, k);
        System.out.println(output);
    }

    private static String rotateStr(String input, int k) {
        char[] charArray = input.toCharArray();

        while(k != 0) {
            for(int i = 0; i < charArray.length - 1; i++) {
                char c = charArray[i];
                charArray[i] = charArray[i+1];
                charArray[i+1] = c;
            }
            k--;
        }

        return new String(charArray);
    }
}
