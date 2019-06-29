public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() == 0){
            return false;
        }

        if (word.length() == 1) {
            return true;
        }

        for (int i = 0; i < word.length() - 1; i++) {
            char curr = word.charAt(i),
            prev = word.charAt(i);
            if ((isCapital(curr) && !isCapital(prev)) ||
                (i != 1 && !isCapital(curr) && isCapital(prev))) {
                return false;
            }
        }

        return true;
    }

    private boolean isCapital(char c){
        if ((c >= 'A') && (c <= 'Z')) {
            return true;
        }

        return false;
    }
}
