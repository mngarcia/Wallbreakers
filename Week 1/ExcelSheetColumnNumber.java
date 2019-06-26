class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int size = s.length();
        char curr;
        int num;

        for (int i = 0; i < size; i++){
            curr = s.charAt(i);
            num = curr - 'A' + 1;
            result += num * Math.pow(26, s.length()- i - 1);
        }

        return result;
    }
}
