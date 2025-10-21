class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        
        int n = nums.length;
        double firstK = 0;
        for(int i = 0; i < k; i++) {
            firstK += nums[i];
        }

        double maximumNumber = firstK;
        for(int i = 1, j = k; j < n; i++, j++) {
            firstK -= nums[i-1];
            firstK += nums[j];

            if(firstK > maximumNumber) {
                maximumNumber = firstK;
            }
        }

        return maximumNumber / k;
    }
}