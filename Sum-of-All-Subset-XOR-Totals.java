class Solution {
    public int subsetXORSum(int[] nums) {
        
        int n = nums.length;
        int bits = 0;
        for(int i = 0; i < n ; i++) {
            bits |= nums[i];
        }

        return (int)(bits * Math.pow(2, n-1));
    }
}