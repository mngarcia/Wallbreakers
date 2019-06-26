class Solution {
    public int[][] transpose(int[][] A) {
        int rowLength = A.length;
        int colLength = A[0].length;
        int[][] result = new int[colLength][rowLength];
        for (int row = 0; row < rowLength; row++)
            for (int col = 0; col < colLength; col++) {
                result[col][row] = A[row][col];
            }
        return result;
    }
}
