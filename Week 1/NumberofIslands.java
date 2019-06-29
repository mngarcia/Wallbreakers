class Solution {
    public int numIslands(char[][] grid) {
        int count = 0, size = grid.length;

        for (int i = 0; i < size; i ++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    count = count + 1;
                    helper(i, j, grid);
                }
            }
        }
        return count;
    }
    private void helper(int i, int j, char[][] grid) {
        int size = grid.length;
        if (i >= 0 && j >= 0 && i < size
            && j < grid[0].length && grid[i][j] == '1') {

            grid[i][j] = 0;
            helper(i - 1, j, grid);
            helper(i + 1, j, grid);
            helper(i, j - 1, grid);
            helper(i, j + 1, grid);
        }
    }
}
