package programs.shiftingarray;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] input = {2, 4, 6, -1, 8, -1, 10};

        //arrangeNegativeToLeft(input);
        arrangeNegativeToRight(input);

        Arrays.stream(input)
                .forEach(e -> System.out.print(e + " "));
    }

    private static void arrangeNegativeToRight(int[] input) {
        int len = input.length;
        int i = len - 1;

        for(int j = len - 1; j >= 0; j--) {
            if(input[j] < 0) {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                i--;
            }
        }
    }

    private static void arrangeNegativeToLeft(int[] input) {
        int i = 0;

        for(int j = 0; j < input.length; j++) {
            if(input[j] < 0) {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                i++;
            }
        }
    }
}
