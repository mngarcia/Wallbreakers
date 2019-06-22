class Solution {
    public int[] sortArrayByParity(int[] A) {
        int size = A.length;
        int last = size - 1;
        int[] odds = new int[size];
        int[] evens = new int[size];
        int evensCount = 0, oddsCount = 0;
        int j = 0;
        for(int i = 0; i < size; i++) {
            if (A[i] % 2 == 0) {
                evens[evensCount++] = A[i];
            } else {
                odds[oddsCount++] = A[i];
            }
        }

        for (int i = evensCount; i < evensCount + oddsCount; i++) {
            evens[i] = odds[j++];
        }

        return evens;     
    }
}
