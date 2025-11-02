class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int totalSum = 0;
        for(int num: nums) {
            totalSum += num;
        }

        int currentSum = 0;
        int n = nums.length;
        int differenceArray[] = new int[nums.length];
        for(int i = 0; i < n; i++) {
            int presentValue = totalSum - currentSum - nums[i];
            differenceArray[i] = Math.abs(presentValue);
            totalSum -= nums[i];
            currentSum += nums[i]; 
        }

        return differenceArray;
    }
}