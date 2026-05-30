package programs.to2array;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };


        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] output = new int[rows][cols];

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                output[r][c] = arr1[r][c] + arr2[r][c];
            }
        }

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                System.out.print(output[r][c] + " ");
            }
            System.out.println();
        }
    }
}
