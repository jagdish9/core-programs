package programs.twopointerapproach;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 2, 0};

        moveZeros(arr);

        Arrays.stream(arr)
                .forEach(a -> System.out.print(a + " "));
    }

    public static void moveZeros(int[] arr) {
        int slow = 0;
        for(int fast = 0; fast < arr.length; fast++) {
            if(arr[fast] != 0) {
                int tmp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = tmp;
                slow++;
            }
        }
    }
}
