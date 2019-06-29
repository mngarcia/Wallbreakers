class Solution {
    public int hammingDistance(int x, int y) {
        int result = 0;
        int a, b;

        for (int i = 0; i < 32; i++) {

            a = x & 1;
            b = y & 1;

            if (a != b) {
                result++;
            }
            x = x >> 1;
            y = y >> 1;
        }

        return result;
    }
}
