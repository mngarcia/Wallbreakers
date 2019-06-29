class Solution {

    public int binaryGap(int N) {
        int[] data = new int[32];
        int count = 0;
        for (int i = 0; i < 32; ++i)
            if (((N >> i) & 1) != 0) {
                data[count] = i;
                count++;
             }

        int result = 0;
        for (int i = 0; i < count - 1; ++i) {
           result = Math.max(result, data[i+1] - data[i]);
        }

        return result;
    }
}
