class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] numbers = new int[101];
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            numbers[nums[i]]++;
        }

        for(int i = 1; i < 101; i++) {
            numbers[i] += numbers[i - 1]; 
        }

        int[] answers = new int[n]; 
        for(int i = 0; i < n; i++) {

            if(nums[i] == 0) {
                answers[i] = 0;
                continue;
            }

            answers[i] = numbers[nums[i] - 1];
        }

        return answers;
    }
}