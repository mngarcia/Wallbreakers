class Solution {
    public int findCircleNum(int[][] M) {
        int count = 0;

        for(int i = 0;i < M.length; i++) {
            if(M[i][i] == 1){
                dfsHelper(M, i);
                count++;
            }
        }
        return count;
    }

    private void dfsHelper(int[][] M, int i) {
        M[i][i] = 0;

        for(int j = 0;j < M.length; j++) {
            if(M[i][j] == 1) {
                M[i][j] = 0;
                M[j][i] = 0;
                dfsHelper(M, j);
            }
        }
    }

}
