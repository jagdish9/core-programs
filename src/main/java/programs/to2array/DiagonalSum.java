package programs.to2array;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(r == c) {
                    primaryDiagonalSum += arr[r][c];
                }
                if (r + c == rows - 1) {
                    secondaryDiagonalSum += arr[r][c];
                }
            }
        }
        System.out.println(primaryDiagonalSum);
        System.out.println(secondaryDiagonalSum);
    }
}
