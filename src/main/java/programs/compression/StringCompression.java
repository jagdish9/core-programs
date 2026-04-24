package programs.compression;

public class StringCompression {
    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c','c','c'};
        int len = compress(input);
        System.out.println(len);
    }

    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while(i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index] = currentChar;
            index++;

            if(count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for(char c : countChars) {
                    chars[index] = c;
                    index++;
                }
            }
        }

        return index;
    }
}
