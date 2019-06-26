class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = Arrays.copyOf(digits,digits.length);
        for(int i = digits.length-1 ; i>=0 ; i--){
            if(digits[i] < 9){
                result[i] = result[i]+1;
                break;

            }else if(digits[i] == 9){
                result[i] = 0;

                if(i == 0){
                    result[i] = 1;
                    result = Arrays.copyOf(result, result.length + 1);
                }
            }
        }

        return result;
    }
}
