package programs.company.kpmg;

import java.util.ArrayList;
import java.util.List;

public class ColoringABorder {
    public static void main(String[] args) {
        int[][] grid = {
                {1,1},
                {1,2}
        };

        int pR = 0;
        int pC = 0;
        int color = 3;

        /*int[][] grid = {
                {1,2,1},
                {1,2,2},
                {2,2,1}
        };

        int pR = 1;
        int pC = 1;
        int color = 2;*/

        /*int[][] grid = {
                {2,2,2,3,3},
                {2,3,3,1,2},
                {2,1,3,2,1}
        };

        int pR = 1;
        int pC = 4;
        int color = 1;*/

        /*int[][] grid = {
                {1,2,1,2,1,2},
                {2,2,2,2,1,2},
                {1,2,2,2,1,2}
        };

        int pR = 1;
        int pC = 3;
        int color = 1;*/

        ColoringABorder coloringABorder = new ColoringABorder();
        int[][] colorGrid = coloringABorder.colorBorderOld(grid, pR, pC, color);
        for(int[] row : colorGrid) {
            for(int c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public int[][] colorBorderOld(int[][] grid, int row, int col, int color) {
        if(grid == null) {
            return null;
        }

        int rows = grid.length;
        int cols = grid[0].length;

        List<int[]> borders = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];

        int originalColor = grid[row][col];

        dfsOld(grid, row, col, originalColor, borders, visited);

        //coloring
        for(int[] eachCell : borders) {
            grid[eachCell[0]][eachCell[1]] = color;
        }

        return grid;
    }

    public void dfsOld(int[][] grid, int r, int c, int color,
                    List<int[]> borders,
                    boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        visited[r][c] = true;
        boolean isBorder = false;

        //up
        if(r-1 < 0 ||  grid[r-1][c] != color) {
            isBorder = true;
        } else if(!visited[r-1][c]) {
            dfsOld(grid, r-1, c, color, borders, visited);
        }

        //down
        if(r+1 >= rows ||  grid[r+1][c] != color) {
            isBorder = true;
        } else if(!visited[r+1][c]) {
            dfsOld(grid, r+1, c, color, borders, visited);
        }

        //left
        if(c-1 < 0 ||  grid[r][c-1] != color) {
            isBorder = true;
        } else if(!visited[r][c-1]) {
            dfsOld(grid, r, c-1, color, borders, visited);
        }

        //right
        if(c+1 >= cols ||  grid[r][c+1] != color) {
            isBorder = true;
        } else if(!visited[r][c+1]) {
            dfsOld(grid, r, c+1, color, borders, visited);
        }

        if(isBorder) {
            borders.add(new int[]{r, c});
        }
    }

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        List<int[]> borders = new ArrayList<>();

        int originalColor = grid[row][col];

        dfs(grid, row, col, originalColor, visited, borders);

        // color border cells
        for (int[] cell : borders) {
            grid[cell[0]][cell[1]] = color;
        }

        return grid;
    }

    public void dfs(int[][] grid,
                    int r,
                    int c,
                    int originalColor,
                    boolean[][] visited,
                    List<int[]> borders) {

        int rows = grid.length;
        int cols = grid[0].length;

        visited[r][c] = true;

        boolean isBorder = false;

        // UP
        if (r - 1 < 0 || grid[r - 1][c] != originalColor) {
            isBorder = true;
        } else if (!visited[r - 1][c]) {
            dfs(grid, r - 1, c, originalColor, visited, borders);
        }

        // DOWN
        if (r + 1 >= rows || grid[r + 1][c] != originalColor) {
            isBorder = true;
        } else if (!visited[r + 1][c]) {
            dfs(grid, r + 1, c, originalColor, visited, borders);
        }

        // LEFT
        if (c - 1 < 0 || grid[r][c - 1] != originalColor) {
            isBorder = true;
        } else if (!visited[r][c - 1]) {
            dfs(grid, r, c - 1, originalColor, visited, borders);
        }

        // RIGHT
        if (c + 1 >= cols || grid[r][c + 1] != originalColor) {
            isBorder = true;
        } else if (!visited[r][c + 1]) {
            dfs(grid, r, c + 1, originalColor, visited, borders);
        }

        if (isBorder) {
            borders.add(new int[]{r, c});
        }
    }
}
