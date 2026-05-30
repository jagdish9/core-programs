package programs.company.kpmg;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };

        IslandPerimeter is = new IslandPerimeter();
        int count = is.islandPerimeter(grid);
        System.out.println(count);
    }

    public int islandPerimeter(int[][] grid) {
        if(grid == null) {
            return 0;
        }

        int perimeter = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == 1) {
                    perimeter += 4;

                    //check top
                    if(r > 0 && grid[r-1][c] == 1) {
                        perimeter -= 2;
                    }

                    //check left
                    if(c > 0 && grid[r][c-1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }

    public int dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols
                || grid[r][c] == 0) {
            return 1;
        }

        grid[r][c] = 0;

        return dfs(grid, r+1, c) +
                dfs(grid, r-1, c) +
                dfs(grid, r, c+1) +
                dfs(grid, r, c-1);
    }
}
