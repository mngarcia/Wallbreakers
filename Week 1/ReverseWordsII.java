class Solution {

    public String reverseWords(String s) {
	    StringBuilder result = new StringBuilder();
	    String[] words = s.split(" ");
	    for (String word: words) {
		    result.append(reverseWord(word)).append(" ");
	    }

	    return result.toString().trim();
    }

    private String reverseWord(String word) {
        char[] result = word.toCharArray();
        int i = 0, j = result.length - 1;
        while (i < j) {
            char temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i++;
            j--;
        }

        return new String(result);
    }
}
