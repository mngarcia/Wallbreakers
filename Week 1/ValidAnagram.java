class Solution {
   public boolean isAnagram(String s, String t) {
      char[] s1, t1;
      String s2, t2;

        if(s.length() != t.length()) {
            return false;
        }

        s1 = s.toCharArray();
        t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        s2 = String.valueOf(s1);
        t2 = String.valueOf(t1);

        if(s2.equals(t2)) {
            return true;
        }

        return false;
    }

}
