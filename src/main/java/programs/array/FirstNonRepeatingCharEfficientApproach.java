package programs.array;

public class FirstNonRepeatingCharEfficientApproach {
    public static void main(String[] args) {
        String input = "racecar";

        char output = getFirstNonRepeatingChar(input);

        System.out.println(output);
    }

    private static char getFirstNonRepeatingChar(String input) {
        int[] frequency = new int[26];

        for(char c : input.toCharArray()) {
            frequency[c - 'a'] = frequency[c - 'a'] + 1;
        }

        for(char c : input.toCharArray()) {
            if(frequency[c - 'a'] == 1)
                return c;
        }

        return '$';
    }
}

//Time complexity: 2*n