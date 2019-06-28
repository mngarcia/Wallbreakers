class Solution {
    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        while(leftIndex < rightIndex) {
            helper(s, leftIndex, rightIndex);
            leftIndex++;
            rightIndex--;
        }
    }
    private void helper(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
