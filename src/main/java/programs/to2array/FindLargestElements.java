package programs.to2array;

public class FindLargestElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int max = 0;
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                max = Math.max(max, arr[r][c]);
            }
        }
        System.out.println(max);
    }
}
