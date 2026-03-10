package programs.java8revision.common;

public class FindMissingNumberInSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; // max number

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int number : arr) {
            actualSum = actualSum + number;
        }

        System.out.println(expectedSum - actualSum);
    }
}
