class Solution {
    public int thirdMax(int[] nums) {
        
        long maximum = Long.MIN_VALUE;
        long secondMaximum = Long.MIN_VALUE;
        long thirdMaximum = Long.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > maximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = maximum;
                maximum = nums[i];
            } else if(nums[i] > secondMaximum && nums[i] < maximum) {
                thirdMaximum = secondMaximum;
                secondMaximum = nums[i];
            } else if(nums[i] > thirdMaximum && nums[i] < secondMaximum) {
                thirdMaximum = nums[i];
            }
        }

        if(thirdMaximum == Long.MIN_VALUE) {
            return (int)maximum;
        } else {
            return (int)thirdMaximum;
        }
    }
}