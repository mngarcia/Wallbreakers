class Solution {
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 0;
        }

        int digits = (int)(Math.log(num) / Math.log(2)) +1;

		return (int)(Math.pow(2, digits) -1) -num;
    }
}
