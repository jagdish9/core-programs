package programs.hackerrank;

import java.util.Arrays;
import java.util.List;

public class GridLandMetro {
    public static void main(String[] args) {
        List<List<Integer>> lampposts = Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(3, 1, 4),
                Arrays.asList(4, 4, 4)
        );

        int[][] lamp = new int[3][3];
        int i = 0;
        for(List<Integer> data : lampposts) {
            int j = 0;
            for(Integer eachData : data) {
                lamp[i][j] = eachData;
                j++;
            }
            i++;
        }

        int[][] grid = new int[4][4];

        for(int x = 0; x < 3; x++) {
            int row = x + 1;
            int c1 = lamp[x][1];
            int c2 = lamp[x][2];
            for(int y = c1 - 1; y < c2; y++) {
                grid[row][y] = -1;
            }
        }

        System.out.println(grid);

        int count = 0;
        for(int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                if(grid[x][y] == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
