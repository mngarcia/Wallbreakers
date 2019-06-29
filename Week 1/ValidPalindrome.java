class Solution {
    public boolean isPalindrome(String s) {
        String noCases = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = noCases.length();

        if (noCases == null || noCases.equals("")) {
            return true;
        }

        for (int i = 0; i < size/2; i++) {
            if (noCases.charAt(i) != noCases.charAt(size - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
