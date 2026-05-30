package programs.company.kpmg;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int count = getIslandCount(grid);
        System.out.println(count);
    }

    private static int getIslandCount(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {

                if(grid[r][c] == 1) {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }

        return count;
    }

    private static void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) {
            return;
        }

        //mark as visited
        grid[r][c] = 0;

        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
}
