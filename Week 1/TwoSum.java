class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[j] == target - nums[i]) {
                    int[] result = {i, j};

                    return result;
                }
            }
        }

        return null;
    }
}
