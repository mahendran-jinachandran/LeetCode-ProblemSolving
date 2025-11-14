class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        int n = nums.length;
        
        if(n == 0) {
            return 0;
        }

        for(int i = 0; i < n; i++) {

            res += nums[i];
            if(res > max) {
                max = res;
            }

            if(res < 0) {
                res = 0;
            }
        }

           return max;
    }
}