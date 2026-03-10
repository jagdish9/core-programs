package programs.company.optimumforpaypalclient;

public class FindMaximumElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 3},
                {9, 2, 8},
                {4, 7, 6}
        };

        int max = arr[0][0];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
