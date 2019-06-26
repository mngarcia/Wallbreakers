class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList();

        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean selfDividing(int num) {
        for (char integer: String.valueOf(num).toCharArray()) {
            if (integer == '0' || (num % (integer - '0') > 0))
                return false;
        }
        return true;
    }
}
