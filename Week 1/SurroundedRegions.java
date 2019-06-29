class Solution {
    public void solve(char[][] board) {
        int size = board.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || i == size -1 ||
                    j == 0 || j == board[0].length - 1) {

                    if(board[i][j] == 'O') {
                        dfs(i,j,board);
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '*') {
                    board[i][j] ='O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }
    private void dfs(int i,int j,char[][] board){
        if(i < 0 || i >= board.length ||
           j < 0 || j >= board[0].length) {
            return;
        }
        if (board[i][j] == 'X' || board[i][j] == '*') {
            return;
        }

        board[i][j] = '*';

        if(i+1 < board.length) {
            dfs(i+1,j,board);
        } else if (i-1 > 0) {
            dfs(i-1,j,board);
        } else if (j+1 < board[0].length) {
            dfs(i,j+1,board);
        } else if (j-1 > 0) {
            dfs(i,j-1,board);
        }

    }
}
