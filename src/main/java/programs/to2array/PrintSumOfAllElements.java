package programs.to2array;

public class PrintSumOfAllElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sum = 0;
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
            }
        }
        System.out.println(sum);
    }
}
