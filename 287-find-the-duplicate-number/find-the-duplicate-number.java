class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (freq[nums[i]] == 1) {
                return nums[i]; // Duplicate found
            }
            freq[nums[i]]++;
        }

        return -1; // Should not reach here as per constraints
    }
}
