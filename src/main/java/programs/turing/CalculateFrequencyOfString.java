package programs.turing;

public class CalculateFrequencyOfString {
    public static void main(String[] args) {
        String word = "takeuforward";
        printFrequencyOfString(word);
    }

    private static void printFrequencyOfString(String word) {
        int[] arr = new int[26];

        for(int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                System.out.print((char) (j + 'a'));
                System.out.print(" " + arr[j]);
                System.out.println();
            }
        }
    }
}
