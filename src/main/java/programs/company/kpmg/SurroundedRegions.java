package programs.company.kpmg;

public class SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        SurroundedRegions sr = new SurroundedRegions();
        sr.edgeRowAndColumn(board);
        sr.solve(board);
        System.out.print("Done");
    }

    private void edgeRowAndColumn(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        //for edge rows
        for(int r = 0; r < rows; r++) {
            dfs(board, r, 0);
            dfs(board, r, cols-1);
        }

        //for edge cols
        for(int c = 0; c < cols; c++) {
            dfs(board, 0, c);
            dfs(board, rows-1, c);
        }
    }

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if(board[r][c] == '#') {
                    board[r][c] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int r, int c) {
        int rows = board.length;
        int cols = board[0].length;

        if(r < 0 || c < 0 || r >= rows || c >= cols
                || board[r][c] != 'O') {
            return;
        }

        board[r][c] = '#';

        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
    }
}
