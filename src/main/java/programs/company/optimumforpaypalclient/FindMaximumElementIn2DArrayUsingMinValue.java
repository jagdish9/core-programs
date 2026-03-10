package programs.company.optimumforpaypalclient;

public class FindMaximumElementIn2DArrayUsingMinValue {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 3},
                {9, 2, 8},
                {4, 7, 6}
        };

        int max = Integer.MIN_VALUE;

        for(int[] row : arr) {
            for(int rowNum : row) {
                max = Math.max(max, rowNum);
            }
        }

        System.out.println(max);
    }
}
