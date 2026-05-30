package programs.to2array;

public class FindSumOfEachRowAndColumnSeparately {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int r = 0; r < arr.length; r++) {
            int rowSum = 0;
            int columnSum = 0;
            for(int c = 0; c < arr[r].length; c++) {
                rowSum += arr[r][c];
                columnSum += arr[c][r];
            }
            System.out.println(r+"thRow: "+rowSum);
            System.out.println(r+"thColumn: "+columnSum);
        }

        /*for(int r = 0; r < arr.length; r++) {
            int columnSum = 0;
            for(int c = 0; c < arr[r].length; c++) {
                columnSum += arr[c][r];
            }
            System.out.println(r+"thColumn: "+columnSum);
        }*/
    }
}
