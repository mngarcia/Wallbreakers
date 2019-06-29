class Solution {
    public String reverseVowels(String s) {

        String vowels = "AaEeIiOoUu";

        int leftIndex = 0, rightIndex = s.length()-1;
        char[] charArray = s.toCharArray();

        while (leftIndex < rightIndex){

            if(vowels.indexOf(charArray[leftIndex]) == -1) {
                leftIndex++;
            }
            else if(vowels.indexOf(charArray[rightIndex]) == -1) {
                rightIndex--;
            }
            else {
                char temp = charArray[leftIndex];
                charArray[leftIndex++] = charArray[rightIndex];
                charArray[rightIndex--] = temp;
            }
        }
        return String.valueOf(charArray);
    }
}
