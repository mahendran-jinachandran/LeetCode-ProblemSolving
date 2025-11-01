class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int n = nums.length;
        int total = 0;
        int prefSum = 0;
        for(int i = 0; i < n; i++) {
            total += nums[i];
        }

        for (int i = 0; i < n; i++) {
            int suffSum = total - prefSum - nums[i];
            if (prefSum == suffSum) {
                return i;
            }
            prefSum += nums[i];
        }

        return -1;
    }
}